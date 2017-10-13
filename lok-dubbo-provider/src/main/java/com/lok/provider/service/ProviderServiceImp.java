package com.lok.provider.service;


import org.springframework.stereotype.Service;
//import com.alibaba.dubbo.config.annotation.Service;
import com.lok.api.InterfaceService;

/**
 * @Description 服务提供方
 * @date 2017年10月11日
 */
@Service
public class ProviderServiceImp implements InterfaceService {

	public void testDubbo() {
		System.out.println("成功调用!!!!!!!!!!！");
	}
}
