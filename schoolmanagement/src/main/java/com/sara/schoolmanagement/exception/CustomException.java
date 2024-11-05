package com.sara.schoolmanagement.exception;

public class CustomException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;
	
	public CustomException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}
