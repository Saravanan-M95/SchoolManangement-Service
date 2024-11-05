package com.sara.schoolmanagement.model;

import java.sql.Timestamp;
import java.util.List;

public class AdmissionRequest 
{
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private Timestamp admissionDate;
	
	private String address;
	
	private String contactNo;
	
	private String standard;
	
	private String division;
	
	private String religion;
	
	private String race;
	
	private Timestamp dob;
	
	private String gender;
	
	private String currentClass;
	
	private String formerClass;
	
	private String formerSchool;
	
	private boolean isHostelate;
	
	private boolean isSibilingInOurSchool;
	
	private String fatherNicNo;
	
	private String fatherName;
	
	private String fatherOccupation;
	
	private String fatherOfficeAddress;
	
	private String fatherMobile;
	
	private String fatherEmail;
	
	private boolean isFatherOldStudent;
	
	private String motherMaidenName;
	
	private String motherName;
	
	private String motherOccupation;
	
	private String motherOfficeAddress;
	
	private String motherMobile;
	
	private String motherEmail;
	
	private boolean isMotherOldStudent;
	
	private boolean isGuardianParent;
	
	private String guardianName;
	
	private String guardianOfficeAddress;
	
	private String guardianMobileNo;
	
	private String guardianEmail;

	private List<SibilingDetails> sibilingDetails;
	
	private String designation;
	
	private String fatherSpouseName;
	
	private String maritalStatus;
	
	private String mobileNo;
	
	private String email;
	
	private boolean isFresher;
	
	private String experience;
	
	private String degree;
	
	private String collegeName;
	
	private String passedYear;
	
	private String percentage;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String landmark;
	
	private String pincode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Timestamp getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Timestamp admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Timestamp getDob() {
		return dob;
	}

	public void setDob(Timestamp dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getFormerClass() {
		return formerClass;
	}

	public void setFormerClass(String formerClass) {
		this.formerClass = formerClass;
	}

	public String getFormerSchool() {
		return formerSchool;
	}

	public void setFormerSchool(String formerSchool) {
		this.formerSchool = formerSchool;
	}

	public boolean isHostelate() {
		return isHostelate;
	}

	public void setHostelate(boolean isHostelate) {
		this.isHostelate = isHostelate;
	}

	public boolean isSibilingInOurSchool() {
		return isSibilingInOurSchool;
	}

	public void setSibilingInOurSchool(boolean isSibilingInOurSchool) {
		this.isSibilingInOurSchool = isSibilingInOurSchool;
	}

	public String getFatherNicNo() {
		return fatherNicNo;
	}

	public void setFatherNicNo(String fatherNicNo) {
		this.fatherNicNo = fatherNicNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherOfficeAddress() {
		return fatherOfficeAddress;
	}

	public void setFatherOfficeAddress(String fatherOfficeAddress) {
		this.fatherOfficeAddress = fatherOfficeAddress;
	}

	public String getFatherMobile() {
		return fatherMobile;
	}

	public void setFatherMobile(String fatherMobile) {
		this.fatherMobile = fatherMobile;
	}

	public String getFatherEmail() {
		return fatherEmail;
	}

	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}

	public boolean isFatherOldStudent() {
		return isFatherOldStudent;
	}

	public void setFatherOldStudent(boolean isFatherOldStudent) {
		this.isFatherOldStudent = isFatherOldStudent;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getMotherOfficeAddress() {
		return motherOfficeAddress;
	}

	public void setMotherOfficeAddress(String motherOfficeAddress) {
		this.motherOfficeAddress = motherOfficeAddress;
	}

	public String getMotherMobile() {
		return motherMobile;
	}

	public void setMotherMobile(String motherMobile) {
		this.motherMobile = motherMobile;
	}

	public String getMotherEmail() {
		return motherEmail;
	}

	public void setMotherEmail(String motherEmail) {
		this.motherEmail = motherEmail;
	}

	public boolean isMotherOldStudent() {
		return isMotherOldStudent;
	}

	public void setMotherOldStudent(boolean isMotherOldStudent) {
		this.isMotherOldStudent = isMotherOldStudent;
	}

	public boolean isGuardianParent() {
		return isGuardianParent;
	}

	public void setGuardianParent(boolean isGuardianParent) {
		this.isGuardianParent = isGuardianParent;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianOfficeAddress() {
		return guardianOfficeAddress;
	}

	public void setGuardianOfficeAddress(String guardianOfficeAddress) {
		this.guardianOfficeAddress = guardianOfficeAddress;
	}

	public String getGuardianMobileNo() {
		return guardianMobileNo;
	}

	public void setGuardianMobileNo(String guardianMobileNo) {
		this.guardianMobileNo = guardianMobileNo;
	}

	public String getGuardianEmail() {
		return guardianEmail;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public List<SibilingDetails> getSibilingDetails() {
		return sibilingDetails;
	}

	public void setSibilingDetails(List<SibilingDetails> sibilingDetails) {
		this.sibilingDetails = sibilingDetails;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFatherSpouseName() {
		return fatherSpouseName;
	}

	public void setFatherSpouseName(String fatherSpouseName) {
		this.fatherSpouseName = fatherSpouseName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFresher() {
		return isFresher;
	}

	public void setFresher(boolean isFresher) {
		this.isFresher = isFresher;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getPassedYear() {
		return passedYear;
	}

	public void setPassedYear(String passedYear) {
		this.passedYear = passedYear;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
