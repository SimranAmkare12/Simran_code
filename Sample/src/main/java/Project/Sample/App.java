package Project.Sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration config = new Configuration();
      config.configure("Employee.cfg.xml");
      SessionFactory factory = config.buildSessionFactory();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      Employee emp = new Employee();
      emp.setId(1345);
      emp.setName("Crazy");
      emp.setCity("Indore");
      session.save(emp);
      t.commit();
      
      /***
       * Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	Student st = new Student();
    	st.setId(111);
    	st.setName("simran");
    	st.setRollno(122);
    	st.setCity("indore");
    	session.save(st);
    	t.commit();
       */
    }
}
