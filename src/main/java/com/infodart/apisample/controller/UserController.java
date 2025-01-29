package com.infodart.apisample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infodart.apisample.dto.ResponseDto;
import com.infodart.apisample.dto.UserDto;
import com.infodart.apisample.service.UserService;

@RestController
@RequestMapping("/userInfo")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/getUser")
	public ResponseEntity<ResponseDto<UserDto>> getUser(@RequestBody UserDto userDto) {
		UserDto user = userService.getUser(userDto);
		return ResponseEntity.ok(ResponseDto.success("200", "Success", "NA", user));
	}

	@PostMapping(value = "/addUser")
	public ResponseEntity<ResponseDto<UserDto>> addUser(@RequestBody UserDto userDto) {
		UserDto user = userService.addUser(userDto);
		return ResponseEntity.ok(ResponseDto.success("200", "Success", "NA", user));
	}

	@GetMapping(value = "/getAllUser")
	public ResponseEntity<ResponseDto<List<UserDto>>> getAllUser() {
		List<UserDto> userList = userService.getAllUser();
		return ResponseEntity.ok(ResponseDto.success("200", "Success", "NA", userList));
	}

}
