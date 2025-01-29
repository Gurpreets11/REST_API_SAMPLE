package com.infodart.apisample.dto;

public enum UserType {

	ADMIN("admin"), MODERATOR("moderator"), USER("user");

	public String value;

	public String getValue() {
		return value;
	}

	private UserType(String value) {
		this.value = value;
	}

}
