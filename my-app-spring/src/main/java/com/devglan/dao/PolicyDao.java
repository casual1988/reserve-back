package com.devglan.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devglan.model.Policy;

@Repository
public interface PolicyDao extends CrudRepository<Policy, Integer> {
	
	List<Policy> findByUserId(int userId);

}
