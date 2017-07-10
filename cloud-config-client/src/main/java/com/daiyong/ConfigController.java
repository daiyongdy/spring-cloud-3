package com.daiyong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong on 2017/7/10.
 * email daiyong@coohua.com
 */
@RestController
public class ConfigController {

	@Value("${from}")
	private String from;

	@RequestMapping("from")
	public String from() {
		return from;
	}

}
