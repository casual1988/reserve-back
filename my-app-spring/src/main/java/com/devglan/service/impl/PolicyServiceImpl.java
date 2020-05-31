package com.devglan.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.devglan.dao.PolicyDao;
import com.devglan.dao.UserDao;
import com.devglan.dto.PolicyDto;
import com.devglan.model.Policy;
import com.devglan.model.User;
import com.devglan.service.PolicyService;


@Service(value = "policyService")
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyDao policyDao;

	@Autowired
	private UserDao userDao;

	public List<Policy> findAll() {
		List<Policy> list = new ArrayList<>();
		policyDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	
	public List<Policy> findByUserId(String username) {
		List<Policy> list = new ArrayList<>();
		User user = userDao.findByUsername(username);
		policyDao.findByUserId(user.getId()).iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		policyDao.deleteById(id);
	}


	@Override
	public Policy findById(int id) {
		Optional<Policy> optionalPolicy = policyDao.findById(id);
		return optionalPolicy.isPresent() ? optionalPolicy.get() : null;
	}

    @Override
    public PolicyDto update(PolicyDto policyDto) {
        Policy policy = findById(policyDto.getId());
        if(policy != null) {
            policyDao.save(policy);
        }
        return policyDto;
    }

    @Override
    public Policy save(PolicyDto policy) {
	    Policy newPolicy = new Policy();
	    newPolicy.setPolicyNumber(policy.getPolicyNumber());
	    newPolicy.setFirstName(policy.getFirstName());
	    newPolicy.setLastName(policy.getLastName());
	    newPolicy.setDescription(policy.getDescription());
	    newPolicy.setDiscount(policy.getDiscount());
	    newPolicy.setUserId(policy.getUserId());
	    newPolicy.setDiscountPercentage(policy.getDiscountPercentage());
        return policyDao.save(newPolicy);
    }

	@Override
	public Policy findOne(String policyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
