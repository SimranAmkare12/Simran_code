package multilevel_inheritance;

public class Test {
	public static void main(String args[]) {
	 Employee e = new  Employee();
	 e.setName(" Simran Amakre");
	 e.setAge(20);
	 e.setEmp_department(" sales department ");
	 e.setEmp_id(1111);
	 
	 System.out.println(e.getName());
	 System.out.println(e.getAge());
	 System.out.println(e.getEmp_department());
	 System.out.println(e.getEmp_id());
	 
	 
	 System.out.println();
	 System.out.println("showing information of person and manager class  ");
	 Manager m = new Manager();
	 m.setEmp_department(" it department" );
	 m.setEmp_id(2222);
	 m.setAge(23);
	 m.setName(" rekha.." );
	 
	 System.out.println(m.getName());
	 System.out.println(m.getAge());
	 System.out.println(m.getEmp_department());
	 System.out.println(m.getEmp_id());
	}
}
