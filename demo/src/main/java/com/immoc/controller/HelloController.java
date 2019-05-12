package com.immoc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immoc.pojo.IMoocJSONResult;
import com.immoc.pojo.Resource;

@RestController
public class HelloController {

	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello, springBoot";
	}
	
	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		Resource bean = new Resource();
		
		BeanUtils.copyProperties(resource, bean);
				
		return IMoocJSONResult.ok(bean);
	}
}
