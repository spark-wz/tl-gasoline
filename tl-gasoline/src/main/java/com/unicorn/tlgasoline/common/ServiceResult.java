package com.unicorn.tlgasoline.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceResult<T> implements Serializable{
	private Boolean success = true;
	private int errorCode;
	private String message;
	private T body;

	public ServiceResult() {
	}

	public ServiceResult(T body) {
		this.body = body;
	}

	public ServiceResult(int errorCode, String message) {
		this.success = false;
		this.errorCode = errorCode;
		this.message = message;
	}


}
