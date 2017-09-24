package com.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soa.dubbo.service.api.DemoService;
import com.soa.dubbo.service.api.MsgInfo;


@Controller
@RequestMapping("/")
public class AppCtrl {
	
//	@Reference	//使用dubbo的注解
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "/index")
	public void index(HttpServletRequest request,HttpServletResponse response) {
		try {
			
			System.out.println("---------------------------------- customer  ");
			
			MsgInfo info =new MsgInfo();
			info.setId(1);
			info.setName("ruisheh");
			List<String> msgs=new ArrayList<String>();
			msgs.add("I");
			msgs.add("am");
			msgs.add("test");
			info.setMsgs(msgs);
			
			List<String> rstMsg = demoService.returnMsgInfo(info).getMsgs();
			System.out.println("List<String> rstMsg = " + rstMsg);
			
			response.getWriter().write("client customer...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
