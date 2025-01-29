package com.infodart.apisample.dto;

public class UserDto {

	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private UserType userType;

	public UserDto() {

	}

	public UserDto(Long userId) {
		super();
		this.userId = userId;
	}

	public UserDto(Long userId, String firstName) {
		this(userId);
		this.firstName = firstName;
	}

	public UserDto(Long userId, String firstName, String lastName) {
		this(userId, firstName);
		this.lastName = lastName;
	}

	public UserDto(Long userId, String firstName, String lastName, String email) {
		this(userId, firstName, lastName);
		this.email = email;
	}

	public UserDto(Long userId, String firstName, String lastName, String email, String mobileNumber) {
		this(userId, firstName, lastName, email);
		this.mobileNumber = mobileNumber;
	}

	public UserDto(Long userId, String firstName, String lastName, String email, String mobileNumber,
			UserType userType) {
		this(userId, firstName, lastName, email, mobileNumber);
		this.userType = userType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
