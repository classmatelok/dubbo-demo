package com.lok.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lok.consumer.service.ConsumerService;

/**
 * @Description 客户方
 * @date 2017年10月11日
 * url: localhost:8081/consumer/testProvider
 */
@Controller
@RequestMapping("consumer")
public class ConsumerController {
	
	@Autowired
	private ConsumerService cs;
	
	@RequestMapping("/testProvider")
	public void testProvider() {
		cs.testProvider();
	}
}
