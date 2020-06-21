package com.woniu.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.web.entity.Product;
import com.woniu.web.mapper.ProductMapper;
import com.woniu.web.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Resource
	private ProductMapper productMapper;
	@Override
	public List<Product> select() throws Exception {
		return productMapper.selectByExample(null);
	}

}
