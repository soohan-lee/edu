package ideatec.edu.spring.frwk.tomcat.vo;

import lombok.Data;

@Data
public class UserVo {

	private String userId;
	private String password;
	private String userName;
	private int phoneNum;
	
//	public UserVo() {
//		
//	}
//	
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public int getPhoneNum() {
//		return phoneNum;
//	}
//	public void setPhoneNum(int phoneNum) {
//		this.phoneNum = phoneNum;
//	}
//
//	@Override
//	public String toString() {
//		return "UserVo [userId=" + userId + ", password=" + password + ", userName=" + userName + ", phoneNum="
//				+ phoneNum + "]";
//	}
}
