package com.sara.schoolmanagement.service.impl;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sara.schoolmanagement.entity.EmployeeDetail;
import com.sara.schoolmanagement.exception.CustomException;
import com.sara.schoolmanagement.model.AdmissionRequest;
import com.sara.schoolmanagement.repo.EmployeeRepo;
import com.sara.schoolmanagement.service.EmployeeService;
import com.sara.schoolmanagement.util.CommonConstants;
import com.sara.schoolmanagement.util.CommonUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private CommonUtils utils;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public String createAdmission(AdmissionRequest admissionRequest) 
	{
		logger.debug("{} - Employee Create Admission entry",admissionRequest.getFirstName());
		
		try 
		{
			EmployeeDetail employeeDetail = new EmployeeDetail();
			employeeDetail.setDesignation(admissionRequest.getDesignation());
			employeeDetail.setFirstName(admissionRequest.getFirstName());
			employeeDetail.setLastName(admissionRequest.getLastName());
			employeeDetail.setFatherSpouseName(admissionRequest.getFatherSpouseName());
			employeeDetail.setDob(admissionRequest.getDob());
			employeeDetail.setGender(admissionRequest.getGender());
			employeeDetail.setMaritalStatus(admissionRequest.getMaritalStatus());
			employeeDetail.setMobileNumber(admissionRequest.getMobileNo());
			employeeDetail.setEmail(admissionRequest.getEmail());
			employeeDetail.setFresher(admissionRequest.isFresher());
			employeeDetail.setExperience(admissionRequest.getExperience());
			employeeDetail.setDegree(admissionRequest.getDegree());
			employeeDetail.setCollegeName(admissionRequest.getCollegeName());
			employeeDetail.setPassedYear(admissionRequest.getPassedYear());
			employeeDetail.setPercentage(admissionRequest.getPercentage());
			employeeDetail.setAddress1(admissionRequest.getAddress1());
			employeeDetail.setAddress2(admissionRequest.getAddress2());
			employeeDetail.setCity(admissionRequest.getCity());
			employeeDetail.setState(admissionRequest.getState());
			employeeDetail.setLandmark(admissionRequest.getLandmark());
			employeeDetail.setPincode(admissionRequest.getPincode());
			employeeRepo.save(employeeDetail);
			
			return utils.frameResponse(CommonConstants.SUCCESS_RESPONSE_CODE, CommonConstants.STATUS_SUCCESS,
					CommonConstants.ADMISSION_SUCCESS, StringUtils.EMPTY);
		}
		catch (Exception e) 
		{
			logger.debug("Exception on Create Staff Admission - {}", e.getMessage());
			return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
					"Unable to Create Admission for - " + admissionRequest.getFirstName(), StringUtils.EMPTY);		
		}
		
	}

	@Override
	public String findAllEmployeeId(int employeeId) 
	{
		try
		{
			Optional<EmployeeDetail> employeeDetail = employeeRepo.findById(employeeId);
			
			if(employeeDetail.isPresent())
				return mapper.writeValueAsString(employeeRepo.findById(employeeId));
			else
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
		} catch (Exception e) {
			throw new CustomException("Exception fetching staff by Id - "+e.getMessage());
		}
	}

}
