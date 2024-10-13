package embedable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

     Configuration config = new Configuration();
     config.configure("hibernate2.cfg.xml");
     Session session = config.buildSessionFactory().openSession();
     Transaction t = session.beginTransaction();
     //Craeting object of Address class
     Address add = new Address();
     add.setCity("bhopal");
     add.setH_no("43 B ");
     add.setPincode(12345);
     add.setStreet("Ratnagiri");
     //creating object of Student class
     Employee emp = new Employee();
     emp.setAddress(add);
     emp.setId(123);
     emp.setGender("Male");
     emp.setName("Mohan");
     emp.setDepartment("sales");
   session.save(emp);
   t.commit();
     
     
     
	}

}
