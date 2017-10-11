package com.lok.provider.imp;


import com.alibaba.dubbo.config.annotation.Service;
import com.lok.provider.TestDubboService;

/**
 * @Description 服务提供方
 * @date 2017年10月11日
 */
//@Service("testDubboService")
@Service
public class TestDubboServiceImp implements TestDubboService {

	public void testDubbo() {
		System.out.println("成功调用！");
	}
}
