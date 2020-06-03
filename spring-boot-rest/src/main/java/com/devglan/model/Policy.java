package com.devglan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column
	private String policyNumber;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String description;
	@Column
	private double discount;
	@Column
	private int discountPercentage;
	@Column
	private double price;
	@Column
	private int userId;
	@Column
	private String carType;
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}
	public Policy(int id, String policyNumber, String firstName, String lastName, 
			String description, double discount,
			int discountPercentage, double price, int userId, String carType) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
		this.discount = discount;
		this.discountPercentage = discountPercentage;
		this.price = price;
		this.userId = userId;
		this.carType = carType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
	
}
