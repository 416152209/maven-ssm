package com.woniu.web.controller;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.web.service.ProductService;
import com.woniu.web.util.HttpClientNoSUtil;
import com.woniu.web.util.HttpClientUtil;
import com.woniu.web.util.Result;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Resource
	private ProductService productService;
//	@GetMapping
//	public Result select() throws Exception{
//		return new Result("200","success",productService.select(),null);
//	}
	
	@RequestMapping("/test")
	public String test() {
//		https://www.baidu.com/
		String url = "https://bbs.csdn.net/topics/390670157";
        String jsonStr = "{xxx}";
        String httpOrgCreateTestRtn = HttpClientUtil.doPost(url, jsonStr, "utf-8");
        System.out.println(httpOrgCreateTestRtn);
		System.out.println("-------------------------------");
		String doPost = HttpClientNoSUtil.doPost(url);
		System.out.println(doPost);
		return "OK TEST";
	}
	

	
}
