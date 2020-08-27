package org.zerock.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class MyControllerAdvice {
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public void handleArrayIndexOutOfBoundsException() {
		log.info("array index 넘음....");
		
	}
}








