package com.sara.schoolmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sara.schoolmanagement.entity.StaffDetail;
import com.sara.schoolmanagement.exception.CustomException;
import com.sara.schoolmanagement.model.AdmissionRequest;
import com.sara.schoolmanagement.repo.StaffRepo;
import com.sara.schoolmanagement.service.StaffService;
import com.sara.schoolmanagement.util.CommonConstants;
import com.sara.schoolmanagement.util.CommonUtils;

@Service
public class StaffServiceImpl implements StaffService 
{

	private static final Logger logger = LoggerFactory.getLogger(StaffServiceImpl.class);
	
	@Autowired
	private CommonUtils utils;
	
	@Autowired
	private StaffRepo staffRepo;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public String createAdmission(AdmissionRequest admissionRequest) 
	{
		logger.debug("{} - Staff Create Admission entry",admissionRequest.getFirstName());
		
		try 
		{
			StaffDetail staffDetail = new StaffDetail();
			staffDetail.setDesignation(admissionRequest.getDesignation());
			staffDetail.setFirstName(admissionRequest.getFirstName());
			staffDetail.setLastName(admissionRequest.getLastName());
			staffDetail.setFatherSpouseName(admissionRequest.getFatherSpouseName());
			staffDetail.setDob(admissionRequest.getDob());
			staffDetail.setGender(admissionRequest.getGender());
			staffDetail.setMaritalStatus(admissionRequest.getMaritalStatus());
			staffDetail.setMobileNumber(admissionRequest.getMobileNo());
			staffDetail.setEmail(admissionRequest.getEmail());
			staffDetail.setFresher(admissionRequest.isFresher());
			staffDetail.setExperience(admissionRequest.getExperience());
			staffDetail.setDegree(admissionRequest.getDegree());
			staffDetail.setCollegeName(admissionRequest.getCollegeName());
			staffDetail.setPassedYear(admissionRequest.getPassedYear());
			staffDetail.setPercentage(admissionRequest.getPercentage());
			staffDetail.setAddress1(admissionRequest.getAddress1());
			staffDetail.setAddress2(admissionRequest.getAddress2());
			staffDetail.setCity(admissionRequest.getCity());
			staffDetail.setState(admissionRequest.getState());
			staffDetail.setLandmark(admissionRequest.getLandmark());
			staffDetail.setPincode(admissionRequest.getPincode());
			staffRepo.save(staffDetail);
			
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
	public String findAllStaffs() 
	{
		try 
		{
			List<StaffDetail> staffDetail = (staffRepo.findAll());
			
			if(staffDetail.isEmpty())
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
			
			return mapper.writeValueAsString(staffRepo.findAll());
		} catch (Exception e) {
			logger.error("Exception fetching all staffs - {}",e.getMessage());
			throw new CustomException("Exception fetching all staffs - "+e.getMessage());
		}
	}

	@Override
	public String findAllStaffId(int staffId) 
	{
		
		try
		{
			Optional<StaffDetail> staffDetail = staffRepo.findById(staffId);
			
			if(staffDetail.isPresent())
				return mapper.writeValueAsString(staffRepo.findById(staffId));
			else
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
		} catch (Exception e) {
			throw new CustomException("Exception fetching staff by Id - "+e.getMessage());
		}
	}

}
