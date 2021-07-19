package ideatec.edu.spring.boot.tomcat.dto;

import lombok.Data;

@Data
public class UserDto {
	private String userId;
	private String password;
	private String userName;
	private int phoneNum;
}
