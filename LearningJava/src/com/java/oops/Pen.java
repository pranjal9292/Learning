package com.java.oops;

public class Pen {

	String brandName;
	int cost;
	String inkType;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getInkType() {
		return inkType;
	}

	public void setInkType(String inkType) {
		this.inkType = inkType;
	}

	public void write(String writeText) {
		System.out.println("Writing - " + writeText);
	}
	
	public static void main(String[] args) {
		Pen parker = new Pen();
		parker.setBrandName("Parker");
		parker.setCost(450);
		parker.setInkType("BALL");
		System.out.println(parker.getBrandName() + " " + parker.getCost() + " " + parker.getInkType());
		parker.write("hi ia m  gsdodsp ");
		
		Student s = new Student("xfx");
		s.rollnumber = 7399;
	}

}
