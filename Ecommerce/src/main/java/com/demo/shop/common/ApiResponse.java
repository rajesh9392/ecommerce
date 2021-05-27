package com.demo.shop.common;

public class ApiResponse {
	
	private final boolean success;
	private final String message;
	
	public ApiResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public String getMessage() {
		return message;
	}
	
	

}
