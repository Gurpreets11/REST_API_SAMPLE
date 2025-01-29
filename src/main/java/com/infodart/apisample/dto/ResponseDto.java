package com.infodart.apisample.dto;

public class ResponseDto<T> {

	private String statusCode;
	private String statusMessage;
	private String error;
	private T responseData;

	public ResponseDto() {
		super();
	}

	public ResponseDto(String statusCode, String statusMessage, String error, T responseData) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.error = error;
		this.responseData = responseData;
	}

	// Static methods for convenience
	public static <T> ResponseDto<T> success(String statusCode, String message, String errorMes, T data) {
		return new ResponseDto<>(statusCode, "success", errorMes, data);
	}

	public static <T> ResponseDto<T> error(String statusCode, String message, String error) {
		return new ResponseDto<>(statusCode, message, error, null);
	}

	// Getters and Setters
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public T getResponseData() {
		return responseData;
	}

	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}

}
