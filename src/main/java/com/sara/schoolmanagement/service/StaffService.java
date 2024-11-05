package com.sara.schoolmanagement.service;

import org.springframework.stereotype.Service;

import com.sara.schoolmanagement.model.AdmissionRequest;

@Service
public interface StaffService 
{
	public String createAdmission(AdmissionRequest admissionRequest);

	public String findAllStaffs();

	public String findAllStaffId(int staffId);

}
