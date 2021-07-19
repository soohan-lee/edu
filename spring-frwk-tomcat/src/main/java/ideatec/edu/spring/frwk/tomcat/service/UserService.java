package ideatec.edu.spring.frwk.tomcat.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ideatec.edu.spring.frwk.tomcat.dto.UserDto;
import ideatec.edu.spring.frwk.tomcat.vo.UserVo;

@Service
public interface UserService {

	public List<UserDto> selectList();

	public int regist(UserDto userDto);

	public int delete(String userId);

	public int update(UserDto userDto);

//	public Map<String,String> test();
}
