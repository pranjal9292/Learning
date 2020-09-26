package com.java.oops;

public class Main {
	public static void main(String[] args) {
		StudentInfo general = new StudentInfo();
		Address address = new Address();
		Subject subject = new Subject();
		Section section = new Section();
		address.setCity("Talwara");
		address.setState("Punjab");
		address.setPincode(114216);
		section.setClassname("B.E.");
		section.setSectionname("a");
		subject.setMaxmarks(100);
		subject.setMymarks(44);
		general.setName("Pranjal");
		general.setAddress(address);
		general.setSection(section);
		general.printDetails();
	}
}
