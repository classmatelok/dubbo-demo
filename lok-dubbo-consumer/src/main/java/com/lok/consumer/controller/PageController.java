package com.lok.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 
 * @date 2017年10月10日
 */

@Controller
@RequestMapping("pages")
public class PageController {

	@RequestMapping(value="{folderName}/{pageName}")
	public String toPage(
			@PathVariable("folderName")String folderName,
			@PathVariable("pageName")String pageName) {
		return folderName + "/" + pageName;
	}
}
