package ideatec.edu.spring.boot.tomcat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ideatec.edu.spring.boot.tomcat.dto.UserDto;


public interface UserService {

	public List<UserDto> selectList();
	
	public int regist(UserDto userDto);
	
	public int delete(String userId);
	
	public int update(UserDto userDto);
}
