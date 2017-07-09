package com.daiyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

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

		return "hello spring cloud";
	}

	@RequestMapping("/hello1")
	public String hello1(@RequestParam String name) {
		return "hello " + name;
	}

	@RequestMapping("/hello2")
	public User hell2(@RequestHeader String name, @RequestHeader Integer age) {
		return new User(name, age);
	}

	@RequestMapping("/hello3")
	public String hello3(@RequestBody User user) {
		return "name : " + user.getName() + " --- " + "age : " + user.getAge();
	}


}
