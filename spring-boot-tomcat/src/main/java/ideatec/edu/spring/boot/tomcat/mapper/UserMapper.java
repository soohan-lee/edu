package ideatec.edu.spring.boot.tomcat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ideatec.edu.spring.boot.tomcat.dto.UserDto;

@Mapper
public interface UserMapper {

	public List<UserDto> selectList();
	
	public int insert(UserDto userDto);
	
	public int delete(String userId);
	
	public int update(UserDto userDto);
}
