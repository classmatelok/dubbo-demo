package com.lok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @Description 消费方
 * @date 2017年10月11日
 */
@Controller
@RequestMapping
public class TestConsumerController {
	
	@Reference
	private TestDubboService tdsProvider;
	
	@RequestMapping("/testProvider")
	public Object testProvider() {
		return null;
	}
}
