package com.daiyong.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by daiyong on 2017/7/6.
 * email daiyong@coohua.com
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	@HystrixCommand(fallbackMethod = "helloFallback")
	public String helloService() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/index", String.class).getBody();
	}

	/**
	 * e为异常
	 * @param e
	 * @return
	 */
	public String helloFallback(Throwable e) {

		System.out.println(e);

		return "降级";
	}

}
