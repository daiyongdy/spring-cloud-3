package com.daiyong.controller;

import com.daiyong.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong on 2017/7/6.
 * email daiyong@coohua.com
 */
@RestController
public class HystrixComsumerController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("consumer")
	public String consumer() {
		return helloService.helloService();
	}

}
