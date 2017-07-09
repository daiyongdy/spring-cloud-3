package com.daiyong.service;

import com.daiyong.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daiyong on 2017/7/9.
 * email daiyong@coohua.com
 */
@FeignClient("HELLO-SERVICE")
public interface HelloService {

	@RequestMapping("/index")
	public String index();

	@RequestMapping("/hello1")
	String hello1(@RequestParam("name") String name);

	@RequestMapping("/hello2")
	User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

	@RequestMapping("/hello3")
	String hello3(@RequestBody User user);

}
