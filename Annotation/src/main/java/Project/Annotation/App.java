package Project.Annotation;

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
      config.configure("Annotation.cfg.xml");
      SessionFactory factory = config.buildSessionFactory();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      Annotaion ann = new Annotaion();
      ann.setId(222);
      ann.setCity("Bhopal");
      session.save(ann);
      t.commit();
    }
}
