package com.daiyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong on 2017/7/5.
 * email daiyong@coohua.com
 */
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/index")
	public String index() {

		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

		System.out.println(serviceInstance.getHost());

		return "success";
	}



}
