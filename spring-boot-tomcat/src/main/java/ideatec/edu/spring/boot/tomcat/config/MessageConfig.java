package ideatec.edu.spring.boot.tomcat.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
		
		source.setBasename("classpath:/prop/message");
		source.setCacheSeconds(60);
		source.setDefaultEncoding("UTF-8");
		Locale.setDefault(Locale.KOREA);
		
		return source;
	}
}
