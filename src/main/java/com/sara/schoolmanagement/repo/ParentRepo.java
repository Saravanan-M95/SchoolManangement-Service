package com.sara.schoolmanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.sara.schoolmanagement.entity.ParentDetail;

public interface ParentRepo extends CrudRepository<ParentDetail, Integer> 
{

}
