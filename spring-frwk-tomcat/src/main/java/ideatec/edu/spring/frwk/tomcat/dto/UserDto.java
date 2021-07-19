package ideatec.edu.spring.frwk.tomcat.dto;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class UserDto {
	@Value("${IDEATEC.edu.user.id }")
	private String userId;
	private String password;
	@Value("${IDEATEC.edu.user.name)")
	private String userName;
	private int phoneNum;
}
