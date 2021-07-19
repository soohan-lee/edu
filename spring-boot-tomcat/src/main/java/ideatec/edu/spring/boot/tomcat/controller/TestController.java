package ideatec.edu.spring.boot.tomcat.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(value = "/hellow1")
	public ResponseEntity<?> hellow1() throws Exception {
		
		String messageError = messageSource.getMessage("message.error", null, Locale.KOREA);
		
		
		Map<String, String> out = new HashMap<>();
		out.put("error", messageError);
		
		return new ResponseEntity<Map<String, String>>(out, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/hellow2", method = RequestMethod.GET)
	public ResponseEntity<?> hellow2() throws Exception {
		
		Map<String, String> out = new HashMap<>();
		out.put("result", "Hellow World 2");
		
		return new ResponseEntity<Map<String, String>>(out, HttpStatus.OK);
	}
}
