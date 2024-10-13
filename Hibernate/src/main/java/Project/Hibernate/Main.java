package Project.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory = config.buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Student st = new Student();
	st.setId(143);
	st.setName("simran");
	st.setRollno(122);
	st.setCity("indore");
	session.save(st);
	t.commit();

	}

}
