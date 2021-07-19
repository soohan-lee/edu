package ideatec.edu.spring.boot.tomcat.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MessageController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public ResponseEntity<Map> test(Locale locale) {
		
		String error = messageSource.getMessage("message.error", null, Locale.KOREA);
		
		Map<String, String> map = new HashMap<>();
		map.put("error", error);
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}
