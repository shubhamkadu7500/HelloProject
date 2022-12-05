package oops;

class Student{
	int roll_no;
	String student_name;
	int age;
	static String university = "SPPU";
	
	public Student() {
		System.out.println("Default constructor getExecuted");
	}
	
	Student(int roll_no , String student_name, int age){
		//System.out.println("Default constructor getExecuted");
		this.roll_no = roll_no;
		this.student_name = student_name;
		this.age = age;
		
	}
	
	void getStudentDetails() {
		System.out.println(this.roll_no + " " + this.student_name + " " + this.age +" "+university);
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"shubham",21);
		s1.getStudentDetails();
		
		Student s2 = new Student(102,"manoj",19);
		s2.getStudentDetails();
		
		

	}

}
