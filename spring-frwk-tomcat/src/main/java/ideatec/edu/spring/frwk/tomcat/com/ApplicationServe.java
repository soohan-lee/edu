package ideatec.edu.spring.frwk.tomcat.com;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop/test.properties")
public class ApplicationServe implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		applicationContext = context;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
