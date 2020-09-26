package datastructure;

public class Student {

	int rollNo;
	String name;
	int marks;
	char grade;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		Student pranjal = new Student();
		pranjal.setGrade('A');
		pranjal.setName("Pranjal");
		pranjal.setMarks(89);
		pranjal.setRollNo(80);

		Student ram = new Student();
		ram.getGrade();
		System.out.println(pranjal.getName() + " " + pranjal.getMarks() + " " + pranjal.getGrade());
	}

}