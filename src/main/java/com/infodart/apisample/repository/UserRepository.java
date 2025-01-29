package com.infodart.apisample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infodart.apisample.dto.UserDto;
import com.infodart.apisample.entity.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
	
	
	//public User findAllByEmail(String email);
	
	public List<User> findAllByEmail(String email);
	
	public User findAllByMobileNumber(String mobileNumber);

}
