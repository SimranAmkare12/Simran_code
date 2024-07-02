package multilevel_inheritance;

public class Employee extends Person{
	
	private int emp_id;
	private String emp_department;
	
	public void show_emp() {
		System.out.println("the employee id");
		System.out.println("the employee department");
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}

	public Employee(String name, int age, int emp_id, String emp_department) {
		super(name, age);
		this.emp_id = emp_id;
		this.emp_department = emp_department;
	}
	public Employee() {
		
	}
	 
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_department=" + emp_department + ", getEmp_id()=" + getEmp_id()
				+ ", getEmp_department()=" + getEmp_department() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
