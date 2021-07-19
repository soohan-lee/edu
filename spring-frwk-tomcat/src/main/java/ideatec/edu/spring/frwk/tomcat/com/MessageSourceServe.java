package ideatec.edu.spring.frwk.tomcat.com;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageSourceServe implements MessageSourceAware{
	
	private static MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource msgSource) {
		messageSource = msgSource;
	}
	
	public static MessageSource getMessageSource() {
		return messageSource;
	}

}
