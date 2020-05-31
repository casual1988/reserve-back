package com.devglan.dto;

public class PolicyDto {
	
	
	private int id;
	private String firstName;
	private String lastName;
	private String policyNumber;
	private double price;
	private int discountPercentage;
	private double discount;
	private String description;
	private int userId;
	private String carType;
	
	public PolicyDto() {
		// TODO Auto-generated constructor stub
	}

	public PolicyDto(int id, String firstName, String lastName, String policyNumber, double price,
			int discountPercentage, double discount, String description, int userId, String carType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.policyNumber = policyNumber;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.discount = discount;
		this.description = description;
		this.userId = userId;
		this.carType = carType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
