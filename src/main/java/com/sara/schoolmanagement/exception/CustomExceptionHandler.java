package com.sara.schoolmanagement.exception;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sara.schoolmanagement.util.CommonConstants;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler 
{
	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	@ExceptionHandler(CustomException.class)
	public final ResponseEntity<Object> handleHeaderException(Exception ex, WebRequest request)
	{
		String message = ex.getMessage();
		logger.error("Exception Message : {}",message);
		
		ExceptionResponse error  = new ExceptionResponse(CommonConstants.STATUS_FAILURE, message);
		
		if(StringUtils.isNotEmpty(message) && message.toLowerCase().contains(CommonConstants.STATUS_UNAUTHORIZED)) 
			return new ResponseEntity<>(error,HttpStatus.UNAUTHORIZED);
		else if(StringUtils.isNotEmpty(message) && message.toLowerCase().contains(CommonConstants.SERVICE_NOT_FOUND)) 
			return new ResponseEntity<>(error,HttpStatus.SERVICE_UNAVAILABLE);
		else if(StringUtils.isNotEmpty(message) && message.toLowerCase().contains(CommonConstants.NOT_FOUND)) 
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
	}
}
