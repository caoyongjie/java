package com.dubbo.demo.start;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.api.DemoService;
import com.dubbo.demo.api.MsgInfo;

/**
 * @author Administrator
 *
 */
public class ConsumerStart  {
	
	public static void main(String[] args) throws InterruptedException{
		ConsumerStart consumer=new ConsumerStart();
		consumer.start();
	}
	
	void start(){
		String configLocation="dubbo-consumer.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		
		DemoService demoService=(DemoService) context.getBean("demoService");
		String [] names=context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for (String string : names) {
			System.out.print(string);
			System.out.print(",");
		}
		System.out.println("----------------------------------");
		
		MsgInfo info =new MsgInfo();
		info.setId(1);
		info.setName("ruisheh");
		List<String> msgs=new ArrayList<String>();
		msgs.add("hello");
		msgs.add("dubbo");
		info.setMsgs(msgs);
		
		System.out.println(demoService.returnMsgInfo(info).getMsgs());
	}
	
}


