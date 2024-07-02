package multilevel_inheritance;

public class Manager extends Employee {
     private int team_size;
      public void show_manager() {
    	  System.out.println(" the manager information");
      }
	public int getTeam_size() {
		return team_size;
	}
	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}
	public Manager(String name, int age, int emp_id, String emp_department, int team_size) {
		super(name, age, emp_id, emp_department);
		this.team_size = team_size;
	}
	public Manager() {
		
	}
	@Override
	public String toString() {
		return "Manager [team_size=" + team_size + ", getTeam_size()=" + getTeam_size() + ", getEmp_id()=" + getEmp_id()
				+ ", getEmp_department()=" + getEmp_department() + ", toString()=" + super.toString() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
