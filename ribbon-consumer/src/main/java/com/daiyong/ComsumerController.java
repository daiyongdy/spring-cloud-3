package com.daiyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by daiyong on 2017/7/5.
 * email daiyong@coohua.com
 */
@RestController
public class ComsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/consumer")
	public String consumer() {

		return restTemplate.getForEntity("http://HELLO-SERVICE/index", String.class).getBody();

	}

}
