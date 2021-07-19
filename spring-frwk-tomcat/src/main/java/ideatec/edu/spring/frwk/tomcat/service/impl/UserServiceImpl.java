package ideatec.edu.spring.frwk.tomcat.service.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ideatec.edu.spring.frwk.tomcat.dto.UserDto;
import ideatec.edu.spring.frwk.tomcat.mapper.UserMapper;
import ideatec.edu.spring.frwk.tomcat.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
//	@Value("${IDEATEC.edu.user.id }")
//	private String id;
//	
//	@Value("${IDEATEC.edu.user.name)")
//	private String name;
////	
	
	
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
//
//	@Override
//	public Map<String, String> test() {
//		// TODO Auto-generated method stub
//		
//		Map<String,String> map = new HashMap<>();
//		
//		map.put("name", name);
//		
//		return map;
//	}


	
	
}
