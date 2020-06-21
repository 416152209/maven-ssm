package com.woniu.web.util;

import java.util.List;

public class Result {
	private String code;// 本次执行状态
	private String message;// 执行信息
	private List<?> list;// 返回的集合数据
	private Object object;// 返回的对象数据

	public Result() {
	}

	public Result(String code, String message, List<?> list, Object object) {
		this.code = code;
		this.message = message;
		this.list = list;
		this.object = object;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
