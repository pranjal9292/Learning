package com.java.oops;

public class Student {
	int rollnumber;
	private String name;
	private String subject;
	private String collegeName;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student(String collegeName) {
		this.collegeName = collegeName;
	}

	public void study(String inclass) {
		System.out.println("studying in -" + inclass);
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void displayStudentInfo() {
		System.out.println(getName() + "    " + rollnumber + "  " + subject);

	}

	public static void main(String[] args) {
		Student ram = new Student("THAPAR");
		ram.displayStudentInfo();
		/*
		 * ram.setRollnumber(25); ram.setName("ram"); ram.setSubject("math");
		 */
		ram.displayStudentInfo();

	}
}
