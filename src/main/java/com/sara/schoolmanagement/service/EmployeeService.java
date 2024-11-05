package com.sara.schoolmanagement.service;

import org.springframework.stereotype.Service;

import com.sara.schoolmanagement.model.AdmissionRequest;

@Service
public interface EmployeeService 
{
	public String createAdmission(AdmissionRequest admissionRequest);

	public String findAllEmployeeId(int employeeId);

}
