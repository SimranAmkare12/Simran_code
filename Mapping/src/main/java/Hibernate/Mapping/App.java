package Hibernate.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    SessionFactory factory =  config.buildSessionFactory();
    Session session = factory.openSession();
    	         
         
         Answer ans = new Answer();
         ans.setAns_id(123);
         ans.setAns("It is a PL");
         
         Question que = new Question();
         que.setQ_id(343);
         que.setQuestion("What is Java");
         que.setAns(ans);
         
         Answer ans2 = new Answer();
         ans2.setAns_id(136);
         ans2.setAns("it is a easy pl");
        
         
         Question que2 = new Question();
         que2.setQ_id(443);
         que2.setQuestion("What is python");
         que2.setAns(ans2);
         
        Transaction t = session.beginTransaction();
         session.save(que);
         session.save(ans);
         
         session.save(que2);
         session.save(ans2);
         
         t.commit();
         
       
         
    }
}
