package com.devglan.service;

import java.util.List;

import com.devglan.dto.PolicyDto;
import com.devglan.model.Policy;

public interface PolicyService {
	
	Policy save(PolicyDto user);
    List<Policy> findAll();
    void delete(int id);
    List<Policy> findByUserId(String username);

    Policy findOne(String policyNumber);

    Policy findById(int id);

    PolicyDto update(PolicyDto policyDto);

}
