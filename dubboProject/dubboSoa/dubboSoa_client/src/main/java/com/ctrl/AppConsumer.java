package com.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soa.dubbo.service.api.DemoService;
import com.soa.dubbo.service.api.MsgInfo;

/**
 * @author Administrator
 *
 */
public class AppConsumer  {
	
	public static void main(String[] args) throws InterruptedException{
		AppConsumer consumer=new AppConsumer();
		consumer.start();
	}
	
	void start(){
		String configLocation="dubbo-consumer.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		
		DemoService demoService=(DemoService) context.getBean("demoService");
		String [] names=context.getBeanDefinitionNames();
		System.out.println("----------------------------------Beans:");
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("----------------------------------");
		
		MsgInfo info =new MsgInfo();
		info.setId(1);
		info.setName("ruisheh");
		List<String> msgs=new ArrayList<String>();
		msgs.add("I");
		msgs.add("am");
		msgs.add("test");
		info.setMsgs(msgs);
		
		System.out.println(demoService.returnMsgInfo(info).getMsgs());
	}
	
}


