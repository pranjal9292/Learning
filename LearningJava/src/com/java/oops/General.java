package com.java.oops;

import java.util.Scanner;

public class General {

	private int age;
	private String name;
	private String emailid;
	private float weight;
	private Address address;
	private Scanner scann = new Scanner(System.in);

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public void inputDetails() {
		System.out.println("Please Enter input ");
		name = scann.next();
		emailid = scann.next();
		age = scann.nextInt();
		weight = scann.nextFloat();
	}

	public void printDetails() {
		System.out.println("the name: " + name);
		System.out.println("the age: " + age);
		System.out.println("the weight: " + weight);
		System.out.println("the email: " + emailid);
		System.out.println("the city: " + address.getCity());
		System.out.println("the state: " + address.getState());
	}

	public void closeScanner() {
		scann.close();
	}

}
