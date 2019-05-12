package com.immoc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.immoc.pojo.IMoocJSONResult;
import com.immoc.pojo.User;

@Controller
//@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	@ResponseBody
	public User hello() {
		User u = new User();
		u.setName("immoc2222");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("immoc");
		
		return u;		
	}
	
	@RequestMapping("/getUserJson")
	@ResponseBody
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("immoc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("immoc");
		u.setDesc("hello, immoc");
		
		return IMoocJSONResult.ok(u);
	}
	
}
