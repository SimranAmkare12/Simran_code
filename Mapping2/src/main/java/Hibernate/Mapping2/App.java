package Hibernate.Mapping2 ;

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
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
  
        Answer ans = new Answer();
        ans.setA_id(220);
        ans.setAns("my name is Alex");
        
      
        
       Question que =  new Question();
       que.setQ_id(111);
       que.setQuestion("what is your name");
       que.setAns(ans);
       ans.setQ(que);
       
  
      /////////////////////////////////////////////  
      
        Answer ans2 = new Answer();
        ans2.setA_id(110);
        ans2.setAns("Iam 10 years old");
        
       Question que2 =  new Question();
       que2.setQ_id(222);
       que2.setQuestion("How old you are ?");
       que2.setAns(ans);
       ans2.setQ(que2);
   
   //////////////////////////////////////////////  
     
       Answer ans1 = new Answer();
       ans1.setA_id(330);
       ans1.setAns("Iam from london");
       
      Question que1 =  new Question();
      que1.setQ_id(333);
      que1.setQuestion("Where you are from?");
      que1.setAns(ans);
      ans1.setQ(que1);
  
    ////////////////////////////////////////////////      
     Transaction t = session.beginTransaction();
  
      session .save(que);
      session.save(ans);
      
      session .save(que1);
      session.save(ans1);
      
      session .save(que2);
      session.save(ans2);

     t.commit();
     
     
     //////////////////////////////////
     
     Answer value = session.get(Answer.class, 220);
     System.out.println(value.getQ().getQuestion());
     System.out.println(value.getAns());
       
      
    }
}
