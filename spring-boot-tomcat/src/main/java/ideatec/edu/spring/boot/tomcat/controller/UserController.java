package ideatec.edu.spring.boot.tomcat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ideatec.edu.spring.boot.tomcat.dto.UserDto;
import ideatec.edu.spring.boot.tomcat.service.UserService;
import ideatec.edu.spring.boot.tomcat.vo.UserVo;

@RestController
@RequestMapping(value = "/springboot/edu/home")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ResponseEntity<?> userList() throws Exception{
		
		List<UserDto> userList = userService.selectList();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", userList);
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ResponseEntity<?> regist(@RequestBody UserVo userVo, final HttpServletResponse response, final HttpServletRequest request, final HttpSession session) throws Exception {
		
		UserDto userDto = new UserDto();
		userDto.setUserId(userVo.getUserId());
		userDto.setUserName(userVo.getUserName());
		userDto.setPassword(userVo.getPassword());
		userDto.setPhoneNum(userVo.getPhoneNum());
		userService.regist(userDto);
		int a=0; 
		
		return new ResponseEntity<>(a, HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ResponseEntity<?> deleteUser(@RequestBody UserVo userVo, final HttpServletResponse response, final HttpServletRequest request, final HttpSession session) throws Exception {
		int b = 0;
		UserDto userDto = new UserDto();
		userDto.setUserId(userVo.getUserId());
		userService.delete(userDto.getUserId());
		
		return new ResponseEntity<>(b, HttpStatus.OK);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ResponseEntity<?> updateUser(@RequestBody UserVo userVo, final HttpServletResponse response, final HttpServletRequest request, final HttpSession session) throws Exception {
		
		UserDto userDto = new UserDto();
		userDto.setUserId(userVo.getUserId());
		userDto.setUserName(userVo.getUserName());
		userDto.setPassword(userVo.getPassword());
		userDto.setPhoneNum(userVo.getPhoneNum());		
		
		userService.update(userDto);
		int c = 0;
		return new ResponseEntity<>(c, HttpStatus.OK);
	}
	
	
}
