package Project.Hibernate;

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
       config.configure("hibernate.cfg.xml");
       SessionFactory factory =  config.buildSessionFactory();
       Session session = factory.openSession();
       Student st = new Student();
       st.setId(6567);
       st.setName("Haristuata");
       st.setRollno(9645);
       st.setCity("Bhopal");
       Transaction t = session.beginTransaction();
       session.save(st);
       t.commit();
    }
}
