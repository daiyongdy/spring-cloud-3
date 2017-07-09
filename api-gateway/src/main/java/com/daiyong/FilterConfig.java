package com.daiyong;

import org.springframework.context.annotation.Bean;

/**
 * Created by daiyong on 2017/7/9.
 * email daiyong@coohua.com
 */
public class FilterConfig {

	@Bean
	public AccessFilter filter() {
		return new AccessFilter();
	}

}
