package com.dubbo.demo.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class ProviderStart  {
	
	public static void main(String[] args) throws InterruptedException{
		ProviderStart provider=new ProviderStart();
		provider.start();
		
		com.alibaba.dubbo.container.Main.main(args);//通过dubbo的container加载
	}
	
	private void start(){
		String configLocation="dubbo-provider.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		String [] names=context.getBeanDefinitionNames();
		System.out.println("---------------------------Beans:");
		for (String string : names)
			System.out.println(string+",");
		System.out.println("--------------------------");
	}
	
}
