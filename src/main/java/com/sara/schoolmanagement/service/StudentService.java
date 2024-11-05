package com.sara.schoolmanagement.service;

import org.springframework.stereotype.Service;

import com.sara.schoolmanagement.model.AdmissionRequest;

@Service
public interface StudentService 
{
	public String createAdmission(AdmissionRequest admissionRequest);

	public String searchByClass(String standard, String division);

	public String searchByAdmissionNo(int admissionNo);

	public String searchByFirstName(String firstName);
}
