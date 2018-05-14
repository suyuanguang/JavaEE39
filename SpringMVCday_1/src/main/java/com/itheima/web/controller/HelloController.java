package com.itheima.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 第一个springMVC控制器
 * @author mmm
 *
 */
@Controller

public class HelloController {
	
	    @RequestMapping("/hello")
		public String sayHello() {
			System.out.println("hello方法执行了");
			return "success";
		}
}
