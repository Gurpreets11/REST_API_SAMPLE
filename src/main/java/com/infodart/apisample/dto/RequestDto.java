package com.infodart.apisample.dto;

public class RequestDto<T> {

	private String userId;
	private String token;
	private T requestData;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public T getRequestData() {
		return requestData;
	}
	public void setRequestData(T requestData) {
		this.requestData = requestData;
	}
	
	
	
	
}
