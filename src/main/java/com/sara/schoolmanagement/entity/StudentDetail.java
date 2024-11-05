package com.sara.schoolmanagement.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Table(name ="student")
@Entity
public class StudentDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "admission_no")
	private Long admissionNo;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "admission_date")
	private Timestamp admissionDate;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "contact_no")
	private String contactNo;
	
	@Column(name = "religion")
	private String religion;
	
	@Column(name = "standard")
	private String standard;
	
	@Column(name = "division")
	private String division;
	
	@Column(name = "race")
	private String race;
	
	@Column(name = "dob")
	private Timestamp dob;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "current_class")
	private String currentClass;
	
	@Column(name = "former_class")
	private String formerClass;
	
	@Column(name = "former_school")
	private String formerSchool;
	
	@Column(name = "is_hostelate")
	private boolean isHostelate;
	
	@Column(name = "is_sibiling_in_our_school")
	private boolean isSibilingInOurSchool;
	
	@OneToOne(mappedBy = "studentDetail")
	private ParentDetail parentDetail;
	
//	@Transient
//	private List<SibilingDetails> sibilingDetails;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Long getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}

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

	public ParentDetail getParentDetail() {
		return parentDetail;
	}

	public void setParentDetail(ParentDetail parentDetail) {
		this.parentDetail = parentDetail;
	}

//	public List<SibilingDetails> getSibilingDetails() {
//		return sibilingDetails;
//	}
//
//	public void setSibilingDetails(List<SibilingDetails> sibilingDetails) {
//		this.sibilingDetails = sibilingDetails;
//	}
	
}
