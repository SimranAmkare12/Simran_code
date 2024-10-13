package embedable;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetData {

	
	public static void main(String[] args) {
		 Configuration config = new Configuration();
	     config.configure("hibernate2.cfg.xml");
	     Session session = config.buildSessionFactory().openSession();
//	     Employee emp = session.get(Employee.class, 12);
//	     System.out.println(emp);
	     
	     
	     Employee emp = session.load(Employee.class, 123);
	     System.out.println(emp);
	     
	}
}
