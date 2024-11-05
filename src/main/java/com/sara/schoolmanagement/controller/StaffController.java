package com.sara.schoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sara.schoolmanagement.model.AdmissionRequest;
import com.sara.schoolmanagement.service.StaffService;
import com.sara.schoolmanagement.util.CommonConstants;

@RestController
@RequestMapping("/staff")
public class StaffController 
{
	@Autowired
	private StaffService staffService;
	
	@PostMapping(path = "/create/admission", produces = CommonConstants.APPLICATION_JSON)
	public String createAdmission(@RequestBody AdmissionRequest admissionRequest)
	{
		return staffService.createAdmission(admissionRequest);
	}
	
	@GetMapping(path = "/find/all", produces = CommonConstants.APPLICATION_JSON)
	public String findAllStaffs()
	{
		return staffService.findAllStaffs();
	}
	
	@GetMapping(path = "/find/staffId", produces = CommonConstants.APPLICATION_JSON)
	public String findByStaffId(@RequestParam("staffId") int staffId)
	{
		return staffService.findAllStaffId(staffId);
	}
	
//	@GetMapping(path = "/search/class", produces = CommonConstants.APPLICATION_JSON)
//	public String findByClass(@RequestParam("standard") String standard, @RequestParam("division") String division)
//	{
//		return studentService.searchByClass(standard, division);
//	}
//	
//	@GetMapping(path = "/search/admission/number", produces = CommonConstants.APPLICATION_JSON)
//	public String findByClass(@RequestParam("admissionNo") int admissionNo)
//	{
//		return studentService.searchByAdmissionNo(admissionNo);
//	}
//	
//	@GetMapping(path = "/search/first/name", produces = CommonConstants.APPLICATION_JSON)
//	public String findByClass(@RequestParam("firstName") String firstName)
//	{
//		return studentService.searchByFirstName(firstName);
//	}
}
