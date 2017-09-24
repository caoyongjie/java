package com.soa.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.soa.dubbo.service.api.DemoService;
import com.soa.dubbo.service.api.MsgInfo;

@Service
public class DemoServiceImpl implements DemoService {
	
	public void sayHello() {
		System.out.println("DemoServiceImpl.sayHello is called ");
		System.out.println("hello world!");
	}

	public String returnHello() {
		System.out.println("DemoServiceImpl.returnHello is called ");
		return "hello world!";
	}

	public MsgInfo returnMsgInfo(MsgInfo info) {
		System.out.println("DemoServiceImpl.returnMsgInfo is called ");
		info.getMsgs().add("测试消息001");
		return info;
	}
	
}