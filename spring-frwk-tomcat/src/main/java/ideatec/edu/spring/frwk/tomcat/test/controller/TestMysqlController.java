package ideatec.edu.spring.frwk.tomcat.test.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/spring/**/root-context.xml" })
public class TestMysqlController {
	
	
	
	public static final String URL = "jdbc:mysql://localhost:3306/spring_edu?serverTimezone=Asia/Seoul";
	public static final String USER = "root";
	public static final String PW = "system";
	
	@Test
	public void testConnection() throws Exception
	{
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("success");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
