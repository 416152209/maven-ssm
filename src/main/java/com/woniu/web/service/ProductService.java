package com.woniu.web.service;

import java.util.List;

import com.woniu.web.entity.Product;

public interface ProductService {
	public List<Product> select() throws Exception;
}
