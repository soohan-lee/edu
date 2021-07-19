package ideatec.edu.spring.boot.tomcat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ideatec.edu.spring.boot.tomcat.dto.UserDto;
import ideatec.edu.spring.boot.tomcat.mapper.UserMapper;
import ideatec.edu.spring.boot.tomcat.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserDto> selectList() {
		// TODO Auto-generated method stub
		return userMapper.selectList();
	}

	@Override
	public int regist(UserDto userDto) {
		// TODO Auto-generated method stub
		return userMapper.insert(userDto);
	}

	@Override
	public int delete(String userId) {
		// TODO Auto-generated method stub
		return userMapper.delete(userId);
	}

	@Override
	public int update(UserDto userDto) {
		// TODO Auto-generated method stub
		return userMapper.update(userDto);
	}

}
