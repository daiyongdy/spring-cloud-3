package com.daiyong.controller;

import com.daiyong.User;
import com.daiyong.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong on 2017/7/9.
 * email daiyong@coohua.com
 */
@RestController
public class ConsumerController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("consumer")
	public String consumer() {
		return helloService.index();
	}

		@RequestMapping("consumer2")
	public String consumer2() {
		StringBuilder sb = new StringBuilder();
		sb.append("hello1 : " + helloService.hello1("daiyong")).append("\r\n")
		  .append("hello2 : " + helloService.hello2("daiyong", 27)).append("\r\n")
		  .append("hello3 : " + helloService.hello3(new User("wangmeng", 28)));

		return sb.toString();
	}
}
