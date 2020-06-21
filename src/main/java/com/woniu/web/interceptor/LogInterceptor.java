package com.woniu.web.interceptor;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LogInterceptor implements HandlerInterceptor  {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println(request.getRequestURL());
		System.out.println("----------------");
		File file = new File("G:\\test.txt");
		response.setContentType("multipart/form-data"); 
		response.setHeader("Content-Disposition", "attachment;fileName="+"a.txt"); 
		FileInputStream inputStream = new FileInputStream(file);
		
		ServletOutputStream out = response.getOutputStream();
		int b = 0;   
		byte[] buffer = new byte[512];
		while (b != -1) {
			b = inputStream.read(buffer);
			// 4.写到输出流(out)中
			out.write(buffer, 0, b);
		}
		inputStream.close();
		out.close();
		out.flush();
		return true;
	}
}
