package com.infodart.apisample.service;

import java.util.List;

import com.infodart.apisample.dto.UserDto;

public interface UserService {

	public UserDto getUser(UserDto userDto);

	public UserDto addUser(UserDto userDto);

	public List<UserDto> getAllUser();

	// UserDto adduser(RequestDto<com.infodart.apisample.serviceImpl.T> requestDto);

}
