package com.mvc.model;

public class Student {
	
	private String name;
	private String department;
	private double mark1;
	private double mark2;
	private double total=mark1+mark2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public double getTotal() {
		return total;
	}
	
	
	
	

}
