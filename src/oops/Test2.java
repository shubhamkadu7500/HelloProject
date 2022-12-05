package oops;
import java.time.LocalDate;
import java.time.Period;

class Employee{
	int emp_id =101;
	String emp_name ="shubham";
	String emp_email = "shubhamkadu7500@gmail.com";
	String emp_dob = "2001-05-14";//yyyy/mm/dd
	
	void getEmployeeDetails() {
		System.out.println(emp_id + ", "+ emp_name + ", " + emp_email + ", " + emp_dob + " .");
	}
	
	void CalculateAge() {
		LocalDate dob = LocalDate.parse(emp_dob);
		LocalDate curDate = LocalDate.now();
		System.out.println(emp_name + " " + "is" + " " + Period.between(dob, curDate).getYears() + " " + "years old.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getEmployeeDetails();
		e1.CalculateAge();

	}

}
