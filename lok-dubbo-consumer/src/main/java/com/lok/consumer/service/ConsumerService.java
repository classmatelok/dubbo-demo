package com.lok.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.alibaba.dubbo.config.annotation.Service;
//import com.alibaba.dubbo.config.annotation.Reference;
import com.lok.api.InterfaceService;

/**
 * @Description 
 * @date 2017年10月13日
 */
@Service
public class ConsumerService {

	//@Reference//用dubbo管理依赖注入要考虑和spring容器顺序问题，这里暂直接用spring的管理
	@Autowired
	private InterfaceService iService;
	
	public void testProvider() {
		iService.testDubbo();
	}
}
