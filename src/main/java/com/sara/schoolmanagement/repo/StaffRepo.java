package com.sara.schoolmanagement.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sara.schoolmanagement.entity.StaffDetail;

public interface StaffRepo extends CrudRepository<StaffDetail, Integer> 
{
	public List<StaffDetail> findAll();
}
