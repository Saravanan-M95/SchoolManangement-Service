package com.sara.schoolmanagement.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sara.schoolmanagement.entity.EmployeeDetail;

public interface EmployeeRepo extends CrudRepository<EmployeeDetail, Integer> 
{
	public List<EmployeeDetail> findAll();
}
