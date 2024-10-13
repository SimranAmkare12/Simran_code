package one_to_many;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("one_to_many.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		Answers ans =  session.get(Answers.class, 111);
		System.out.println(ans.getQuestion().getQuestion());
		System.out.println(ans.getAnswer());
		
		Questions que = session.get(Questions.class, 1);
	    System.out.println(	que.getQuestion());
	   for(Answers i:que.getAnswer()) {
		   System.out.println(i.getAnswer());
	   }
		
	}

}
