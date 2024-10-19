package com.sara.schoolmanagement.util;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sara.schoolmanagement.model.Response;

@Service
public class CommonUtils 
{
	@Autowired
	private Gson gson;
	
	public Timestamp getCurrentTimeStamp()
	{
		Date date = new Date();
		long time = date.getTime();
		return new Timestamp(time);
	}
	
	public String frameResponse(int code, String status, String message, String data)
	{
		Response response = new Response();
		response.setCode(code);
		response.setStatus(status);
		response.setMessage(message);
		response.setData(StringEscapeUtils.unescapeJava(data));
		return StringEscapeUtils.unescapeJava(gson.toJson(response));
	}
}
