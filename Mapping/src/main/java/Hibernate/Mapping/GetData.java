package Hibernate.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory =  config.buildSessionFactory();
        Session session = factory.openSession();
        
      Answer que = session.get(Answer.class, 123);
        System.out.println(que.getAns());
      
	}

}
