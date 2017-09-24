package com.dubbo.demo.service;

import com.dubbo.demo.api.DemoService;
import com.dubbo.demo.api.MsgInfo;


public class DemoServiceImpl implements DemoService {

	public void sayHello() {
		System.out.println("hello world!");
	}

	public String returnHello() {
		return "hello world!";
	}

	public MsgInfo returnMsgInfo(MsgInfo info) {
		System.out.println("----------------- DemoServiceImpl.returnMsgInfo is called ------------------");
		info.getMsgs().add("测试消息001");
		return info;
	}
}

