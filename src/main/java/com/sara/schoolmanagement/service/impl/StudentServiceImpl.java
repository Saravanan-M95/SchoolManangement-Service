package com.sara.schoolmanagement.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sara.schoolmanagement.entity.ParentDetail;
import com.sara.schoolmanagement.entity.StudentDetail;
import com.sara.schoolmanagement.exception.CustomException;
import com.sara.schoolmanagement.model.AdmissionRequest;
import com.sara.schoolmanagement.repo.ParentRepo;
import com.sara.schoolmanagement.repo.StudentRepo;
import com.sara.schoolmanagement.service.StudentService;
import com.sara.schoolmanagement.util.CommonConstants;
import com.sara.schoolmanagement.util.CommonUtils;

@Service
public class StudentServiceImpl implements StudentService 
{

	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Autowired
	private CommonUtils utils;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private ParentRepo parentRepo;
	
	@Override
	public String createAdmission(AdmissionRequest admissionRequest) 
	{

		logger.debug("{} - Student Create Admission entry",admissionRequest.getFirstName());

		try {
			StudentDetail studentDetail = new StudentDetail();
			studentDetail.setAdmissionNo(studentRepo.getAdmissionNo());
			studentDetail.setFirstName(admissionRequest.getFirstName());
			studentDetail.setLastName(admissionRequest.getLastName());
			studentDetail.setMiddleName(admissionRequest.getMiddleName());
			studentDetail.setAdmissionDate(utils.getCurrentTimeStamp());
			studentDetail.setAddress(admissionRequest.getAddress());
			studentDetail.setContactNo(admissionRequest.getContactNo());
			studentDetail.setStandard(admissionRequest.getStandard());
			studentDetail.setDivision(admissionRequest.getDivision());
			studentDetail.setReligion(admissionRequest.getReligion());
			studentDetail.setRace(admissionRequest.getRace());
			studentDetail.setDob(admissionRequest.getDob());
			studentDetail.setGender(admissionRequest.getGender());
			studentDetail.setCurrentClass(admissionRequest.getCurrentClass());
			studentDetail.setFormerClass(admissionRequest.getFormerClass());
			studentDetail.setFormerSchool(admissionRequest.getFormerSchool());
			studentDetail.setHostelate(admissionRequest.isHostelate());
			studentDetail.setSibilingInOurSchool(admissionRequest.isSibilingInOurSchool());
			StudentDetail persistedStudent = studentRepo.save(studentDetail);

			if (null != persistedStudent && persistedStudent.getStudentId() > 0
					&& persistedStudent.getAdmissionNo() > 0) {
				logger.debug("Admission Generated and persisted for - {} with admission no - {}",
						persistedStudent.getFirstName(), persistedStudent.getAdmissionNo());
				logger.debug("Persisting Parent Details for - {}", persistedStudent.getFirstName());

				ParentDetail parentDetail = new ParentDetail();
				parentDetail.setStudentId(persistedStudent.getStudentId());
				parentDetail.setFatherNicNo(admissionRequest.getFatherNicNo());
				parentDetail.setFatherName(admissionRequest.getFatherName());
				parentDetail.setFatherOccupation(admissionRequest.getFatherOccupation());
				parentDetail.setFatherOfficeAddress(admissionRequest.getFatherOfficeAddress());
				parentDetail.setFatherMobile(admissionRequest.getFatherMobile());
				parentDetail.setFatherEmail(admissionRequest.getFatherEmail());
				parentDetail.setFatherOldStudent(admissionRequest.isFatherOldStudent());

				parentDetail.setMotherMaidenName(admissionRequest.getMotherMaidenName());
				parentDetail.setMotherName(admissionRequest.getMotherName());
				parentDetail.setMotherOccupation(admissionRequest.getMotherOccupation());
				parentDetail.setMotherOfficeAddress(admissionRequest.getMotherOfficeAddress());
				parentDetail.setMotherMobile(admissionRequest.getMotherMobile());
				parentDetail.setMotherEmail(admissionRequest.getMotherEmail());
				parentDetail.setMotherOldStudent(admissionRequest.isMotherOldStudent());
				parentDetail.setGuardianParent(admissionRequest.isGuardianParent());
				parentDetail.setGuardianName(admissionRequest.getGuardianName());
				parentDetail.setGuardianOfficeAddress(admissionRequest.getGuardianOfficeAddress());
				parentDetail.setGuardianMobileNo(admissionRequest.getGuardianMobileNo());
				parentDetail.setGuardianEmail(admissionRequest.getGuardianEmail());
				parentRepo.save(parentDetail);

				return utils.frameResponse(CommonConstants.SUCCESS_RESPONSE_CODE, CommonConstants.STATUS_SUCCESS,
						CommonConstants.ADMISSION_SUCCESS, StringUtils.EMPTY);
			} else
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.ADMISSION_FAILED, StringUtils.EMPTY);
		} catch (Exception e) {
			logger.debug("Exception on Create Students Admission - {}", e.getMessage());
			return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
					"Unable to Create Admission for - " + admissionRequest.getFirstName(), StringUtils.EMPTY);
		}

	}

	@Override
	public String searchByClass(String standard, String division) 
	{
		List<StudentDetail> students = studentRepo.findByStandardAndDivision(standard, division);
		try {
			if (students.isEmpty()) {
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
			}
			return mapper.writeValueAsString(students);

		} catch (Exception e) {
			logger.error("Exception on Search by Class - {}", e.getMessage());
			throw new CustomException("Exception on Search by Class - " + e.getMessage());
		}
	}

	@Override
	public String searchByAdmissionNo(int admissionNo) 
	{
		StudentDetail student = studentRepo.findByAdmissionNo(admissionNo);
		try {
			if (null == student) {
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
			}
			return mapper.writeValueAsString(student);

		} catch (Exception e) {
			logger.error("Exception on Search by Class - {}",e.getMessage());
			throw new CustomException("Exception on Search by Class - "+e.getMessage());
		}
	}

	@Override
	public String searchByFirstName(String firstName)
	{
		List<StudentDetail> students = studentRepo.findByFirstNameIgnoreCaseContaining(firstName);
		try {
			if (students.isEmpty()) {
				return utils.frameResponse(CommonConstants.FAILURE_RESPONSE_CODE, CommonConstants.STATUS_FAILURE,
						CommonConstants.NO_RECORDS_FOUND, StringUtils.EMPTY);
			}
			return mapper.writeValueAsString(students);

		} catch (Exception e) {
			logger.error("Exception on Search by Class - {}", e.getMessage());
			throw new CustomException("Exception on Search by Class - " + e.getMessage());
		}
	}

}
