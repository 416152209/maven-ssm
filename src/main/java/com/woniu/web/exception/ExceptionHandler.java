package com.woniu.web.exception;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
@Component
public class ExceptionHandler implements HandlerExceptionResolver{
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception e) {
		e.printStackTrace();
		ModelAndView mav=new ModelAndView();
		FastJsonJsonView view = new FastJsonJsonView();
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("code","500");
		map.put("message","服务器内部错误");
		view.setAttributesMap(map);
		mav.setView(view);
		return mav;
	}

}
