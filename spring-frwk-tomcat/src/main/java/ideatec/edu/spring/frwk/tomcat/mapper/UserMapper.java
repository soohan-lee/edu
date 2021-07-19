package ideatec.edu.spring.frwk.tomcat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import ideatec.edu.spring.frwk.tomcat.dto.UserDto;
import ideatec.edu.spring.frwk.tomcat.vo.UserVo;

@Mapper
public interface UserMapper {
	
	public List<UserDto> selectList();

	public int insert(UserDto userDto);

	public int delete(String userId);

	public int update(UserDto userDto);

}
