package com.soa.dubbo.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个是app Provider
 * @author brain
 */
public class AppProvider  {
	
	public static void main(String[] args) throws InterruptedException{
//		start();//手动加载配置文件
		
		/**
		 * 默认加载META-INF/spring目录下的所有spring配置
		 * 也可通过配置dubbo.properties，加载spring配置文件
		 */
		com.alibaba.dubbo.container.Main.main(args);
	}
	
	@SuppressWarnings("unused")
	private static void start(){
		String configLocation="dubbo-provider.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		String [] names=context.getBeanDefinitionNames();
		System.out.println("---------------------------Beans:");
		for (String string : names)
			System.out.println(string+",");
		System.out.println("--------------------------");
	}
	
}
