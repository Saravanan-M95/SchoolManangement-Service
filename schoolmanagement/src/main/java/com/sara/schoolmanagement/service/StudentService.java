package com.sara.schoolmanagement.service;

import org.springframework.stereotype.Service;

import com.sara.schoolmanagement.model.AdmissionRequest;

@Service
public interface StudentService 
{
	public String createAdmission(AdmissionRequest admissionReques);

	public String searchByClass(String standard, String division);
}
