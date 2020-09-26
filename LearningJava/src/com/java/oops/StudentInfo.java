package com.java.oops;

import java.util.Scanner;

public class StudentInfo {
	private int age;
	private String name;
	private int id;
	private float weight;
	private Address address;
	private Section section;
	private Subject subject;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Scanner getScann() {
		return scann;
	}

	public void setScann(Scanner scann) {
		this.scann = scann;
	}

	/**
	 * 
	 */
	public void inputDetails() {
		System.out.println("Please Enter input ");
		name = scann.next();
		id = scann.nextInt();
		age = scann.nextInt();
		weight = scann.nextFloat();
	}

	public void printDetails() {
		System.out.println("the name: " + name);
		System.out.println("the age: " + age);
		System.out.println("the weight: " + weight);
		System.out.println("the id: " + id);
		System.out.println("the city: " + address.getCity());
		System.out.println("the state: " + address.getState());
		System.out.println("tthe country: " + address.getCountry());
		System.out.println("pincode: " + address.getPincode());
		System.out.println("sectionname: " + section.getSectionname());
		System.out.println("classname: " + section.getClassname());
		System.out.println("subjectname " + subject.getSubjectName());
		System.out.println("maxmarks _" + subject.getMaxmarks());
		System.out.println("mymarks " + subject.getMymarks());

	}

}
