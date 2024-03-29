package com.shop.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class golbalException implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//更改编码设置
		response.setHeader("content-type", "text/html;charset=UTF-8");
		//设置访问路径
		response.setHeader("refresh", "5;url=/shop/index.action");
		zdyException exception =null;
		//系统的异常处理
		if(ex instanceof zdyException){
			exception=(zdyException)ex;
		}else{
			exception.setMessage("发生了未知异常");
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errorMessage",exception.getMessage()+"系统将在5秒之后跳转到首页......");
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
