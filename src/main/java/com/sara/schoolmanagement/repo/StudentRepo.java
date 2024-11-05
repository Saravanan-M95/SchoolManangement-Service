package com.sara.schoolmanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sara.schoolmanagement.entity.StudentDetail;

public interface StudentRepo extends CrudRepository<StudentDetail, Integer> 
{
	@Query(value = "SELECT nextval('public.\"admission_no_seq\"')", nativeQuery = true)
	public Long getAdmissionNo();

	public List<StudentDetail> findByStandardAndDivision(String standard, String division);

	public StudentDetail findByAdmissionNo(long admissionNo);

	public List<StudentDetail> findByFirstNameIgnoreCaseContaining(String firstName);
}
