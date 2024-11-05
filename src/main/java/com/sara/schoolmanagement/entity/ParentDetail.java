package com.sara.schoolmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
public class ParentDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "father_nic_no")
	private String fatherNicNo;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "father_occupation")
	private String fatherOccupation;
	
	@Column(name = "father_office_address")
	private String fatherOfficeAddress;
	
	@Column(name = "father_mobile")
	private String fatherMobile;
	
	@Column(name = "father_email")
	private String fatherEmail;
	
	@Column(name = "is_father_old_student")
	private boolean isFatherOldStudent;
	
	@Column(name = "mother_maiden_name")
	private String motherMaidenName;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "mother_occupation")
	private String motherOccupation;
	
	@Column(name = "mother_office_address")
	private String motherOfficeAddress;
	
	@Column(name = "mother_mobile")
	private String motherMobile;
	
	@Column(name = "mother_email")
	private String motherEmail;
	
	@Column(name = "is_mother_old_student")
	private boolean isMotherOldStudent;
	
	@Column(name = "is_guardian_parent")
	private boolean isGuardianParent;
	
	@Column(name = "guardian_name")
	private String guardianName;
	
	@Column(name = "guardian_office_address")
	private String guardianOfficeAddress;
	
	@Column(name = "guardian_mobile_no")
	private String guardianMobileNo;
	
	@Column(name = "guardian_email")
	private String guardianEmail;
	
	@OneToOne
	@JoinColumn(name="student_id", referencedColumnName = "student_id", insertable = false, updatable = false)
	private StudentDetail studentDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

//	public StudentDetail getStudentDetail() {
//		return studentDetail;
//	}
//
//	public void setStudentDetail(StudentDetail studentDetail) {
//		this.studentDetail = studentDetail;
//	}
	
}
