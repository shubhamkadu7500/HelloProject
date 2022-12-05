package javaabstraction;

abstract class Employee{
	void empDetails() {
		System.out.println("Employeee Details are : shubham from loni.");
	}
	abstract void salary();
}
class HRDepartment extends Employee{
	void salary() {
		System.out.println("salary Details: Rs. 500000.");
	}
}
public class Test4 {
	public static void main(String[] args) {
		HRDepartment obj = new HRDepartment();
		obj.empDetails();
		obj.salary();
	}
}
