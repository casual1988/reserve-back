package com.devglan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devglan.config.JwtTokenUtil;
import com.devglan.dto.PolicyDto;
import com.devglan.model.ApiResponse;
import com.devglan.model.Policy;
import com.devglan.model.User;
import com.devglan.service.PolicyService;
import com.devglan.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/policies")
public class PolicyController {


	@Autowired
	private UserService userService;
	
	@Autowired
	private PolicyService policyService;
	
	@Autowired
    private JwtTokenUtil jwtTokenUtil;
	
	
	 @PostMapping
	    public ApiResponse<Policy> saveUser(@RequestBody PolicyDto policy){
	        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",policyService.save(policy));
	    }
	 
	 @GetMapping
	    public ApiResponse<List<Policy>> listPolicy(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Policy list fetched successfully.",policyService.findAll());
	    }
	 @GetMapping("/{username}")
	    public ApiResponse<List<Policy>> listPoliciesByUserId(@PathVariable String username){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Policy list fetched successfully.",policyService.findByUserId(username));
	    }

	    @GetMapping("/{id}")
	    public ApiResponse<User> getOne(@PathVariable int id){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Policy fetched successfully.",policyService.findById(id));
	    }

	    @PutMapping("/{id}")
	    public ApiResponse<PolicyDto> update(@RequestBody PolicyDto policyDto) {
	        return new ApiResponse<>(HttpStatus.OK.value(), "Policy updated successfully.",policyService.update(policyDto));
	    }
	
}
