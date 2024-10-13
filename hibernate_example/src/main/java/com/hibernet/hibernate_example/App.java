package com.hibernet.hibernate_example;

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
    	
        Configuration con = new Configuration();
        con.configure("hibernet.cfg.xml");
        SessionFactory factory =  con.buildSessionFactory();  // class
        Session session = factory.openSession() ;   // interface
        Student st = new Student(11,"bhopal","mp","5767");
        Transaction t = session.beginTransaction();
        session.persist(st);  // for saving object in student class
        t.commit();
        session.close();
        
        
        
    }
}
