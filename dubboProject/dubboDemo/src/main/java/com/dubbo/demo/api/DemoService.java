package com.dubbo.demo.api;

public interface DemoService {

	public void sayHello();

	public String returnHello();

	public MsgInfo returnMsgInfo(MsgInfo info);

}