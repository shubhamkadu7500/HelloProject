package javainheritance;

// super keyword implementation
class Project{
	int project_id;
	String project_name;
	String status;
	
	
	public Project() {
		System.out.println("Default project class constructor invoked !!!");
		this.project_id = 101;
		this.project_name = "online shoping cart";
		this.status = "in progress";
		
	}
	
	void getProjectDetail() {
		System.out.println(this.project_id + " " + this.project_name + " " + this.status);
	}
	
}

class Task extends Project{
	int task_id;
	String task_name;
	String task_status;
	
	Task(int task_id, String task_name, String task_status){
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_status = task_status;
	}
	
	void getDetails() {
		System.out.println(super.project_name);//
		super.getProjectDetail();//super() invokes parent class constructor
		System.out.println(this.task_id + " " + this.task_name + " " + this.task_status);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Task obj = new Task(01,"implement payment getway","assigned");
		obj.getDetails();
		

	}

}
