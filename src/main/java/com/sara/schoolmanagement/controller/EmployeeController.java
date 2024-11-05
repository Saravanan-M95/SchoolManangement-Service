package com.sara.schoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sara.schoolmanagement.model.AdmissionRequest;
import com.sara.schoolmanagement.service.EmployeeService;
import com.sara.schoolmanagement.util.CommonConstants;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/create/admission", produces = CommonConstants.APPLICATION_JSON)
	public String createAdmission(@RequestBody AdmissionRequest admissionRequest)
	{
		return employeeService.createAdmission(admissionRequest);
	}
	
	@GetMapping(path = "/find/employeeId", produces = CommonConstants.APPLICATION_JSON)
	public String findByEmployeeId(@RequestParam("employeeId") int employeeId)
	{
		return employeeService.findAllEmployeeId(employeeId);
	}
	
}
