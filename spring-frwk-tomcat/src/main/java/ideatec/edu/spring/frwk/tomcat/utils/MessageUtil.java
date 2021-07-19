package ideatec.edu.spring.frwk.tomcat.utils;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;

public class MessageUtil {
	private static MessageSourceAccessor msgAcc = null;
	
	public void setMessageSourceAccessor(MessageSourceAccessor msgAcc) {
		MessageUtil.msgAcc = msgAcc;
	}
	
	public static String getMessage(String code) {
		return msgAcc.getMessage(code, Locale.getDefault());
	}
	
	public static String getMessage(String code, Object[] objs) {
		return msgAcc.getMessage(code, Locale.getDefault());
	}
}
