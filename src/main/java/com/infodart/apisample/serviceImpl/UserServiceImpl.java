package com.infodart.apisample.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.infodart.apisample.dto.UserDto;
import com.infodart.apisample.dto.UserType;
import com.infodart.apisample.entity.User;
import com.infodart.apisample.repository.UserRepository;
import com.infodart.apisample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto getUser(UserDto userDtos) {

		List<User> userList = (List<User>) userRepository.findAllByEmail(userDtos.getEmail());
		UserDto userDto = new UserDto();
		if (!CollectionUtils.isEmpty(userList)) {

			for (User user : userList) {
				userDto.setUserId(user.getID());
				userDto.setEmail(user.getEmail());
				userDto.setFirstName(user.getFirstName());
				userDto.setLastName(user.getLastName());
				userDto.setMobileNumber(user.getMobileNumber());
				UserType userType;
				if (user.getUserType().equals("ADMIN"))
					userType = UserType.ADMIN;
				else if (user.getUserType().equals("MODERATOR"))
					userType = UserType.MODERATOR;
				else
					userType = UserType.USER;
				userDto.setUserType(userType);
			}
		}

		return userDto;
	}

	@Override
	public UserDto addUser(UserDto userDto) {

		// UserDto userDto = requestDto;
		System.out.println("userDto.getEmail() :: " + userDto.getEmail());
		System.out.println("userDto.getMobileNumber() :: " + userDto.getMobileNumber());
		List<User> userList = (List<User>) userRepository.findAllByEmail(userDto.getEmail());
		System.out.println("userList size :: " + userList.size());
		System.out.println("userDto :: " + userDto.toString());
		if (CollectionUtils.isEmpty(userList)) {
			User user = new User();
			user.setEmail(userDto.getEmail());
			user.setFirstName(userDto.getFirstName());
			user.setLastName(userDto.getLastName());
			user.setMobileNumber(userDto.getMobileNumber());
			user.setUserType(userDto.getUserType().getValue());
			user.setCreatedBy("Guri");
			user.setUpdatedBy("");
			userRepository.save(user);
		} else {
			System.out.println("User already exist with this email");
		}
		return userDto;
	}

	@Override
	public List<UserDto> getAllUser() {

		List<User> userList = (List<User>) userRepository.findAll();
		List<UserDto> userDtoList = new ArrayList<>();

		if (CollectionUtils.isEmpty(userList)) {
			System.out.println("No user data found.");
		} else {
			for (User user : userList) {
				UserDto userDto = new UserDto();
				userDto.setUserId(user.getID());
				userDto.setEmail(user.getEmail());
				userDto.setFirstName(user.getFirstName());
				userDto.setLastName(user.getLastName());
				userDto.setMobileNumber(user.getMobileNumber());
				UserType userType;
				if (user.getUserType().equals("admin"))
					userType = UserType.ADMIN;
				else if (user.getUserType().equals("moderator"))
					userType = UserType.MODERATOR;
				else
					userType = UserType.USER;
				userDto.setUserType(userType);
				userDtoList.add(userDto);
			}
		}
		return userDtoList;
	}

}
