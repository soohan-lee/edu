package ideatec.edu.spring.frwk.tomcat.utils;

import org.springframework.context.ApplicationContext;

import ideatec.edu.spring.frwk.tomcat.com.ApplicationServe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropertyUtil {

	public static String getProperty(String propertyName) {
		return getProperty(propertyName, null);
	}
	
	public static String getProperty(String propertyName, String defaultValue) {
		String value = defaultValue;
		ApplicationContext applicationContext = ApplicationServe.getApplicationContext();
		
		if(applicationContext.getEnvironment().getProperty(propertyName) == null)
			log.warn(propertyName + "error occured");
		else value = applicationContext.getEnvironment().getProperty(propertyName);
		
		return value;
	}
}
