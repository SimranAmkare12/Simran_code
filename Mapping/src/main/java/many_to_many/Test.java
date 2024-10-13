package many_to_many;

import java.util.ArrayList;

import javax.persistence.Entity;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("many_to_many.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		
		Question1 que1 = new Question1() ;
		que1.setQuestion_id(1);
		que1.setQuestion("What is java");
		
		Question1 que2 = new Question1() ;
		que2.setQuestion_id(2);
		que2.setQuestion("what do you mean by java");
		
		Question1 que3 = new Question1() ;
		que3.setQuestion_id(3);
		que3.setQuestion("Is java PL");
		
		Answer1 ans1 = new Answer1();
		ans1.setAnswer_id(111);
		ans1.setAnswer("It is Pl");
		
		Answer1 ans2 = new Answer1();
		ans2.setAnswer_id(112);
		ans2.setAnswer("It is object oriented language");
		
		Answer1 ans3 = new Answer1();
		ans3.setAnswer_id(113);
		ans3.setAnswer("It is high level language");
		
		ArrayList<Answer1> answer = new ArrayList<>();
		answer.add(ans3);
		answer.add(ans2);
		answer.add(ans1);
		
		ArrayList<Question1> question = new ArrayList<>();
		question .add(que3);
		question .add(que2);
		question .add(que1);
		
		que1.setAnswer(answer);
		que2.setAnswer(answer);
		que3.setAnswer(answer);
		
		ans1.setQuestion(question);
		ans2.setQuestion(question);
		ans3.setQuestion(question);
		
		 Transaction t = session.beginTransaction();
		 session.save(que1);
		 session.save(que2);
		 session.save(que3);
		 
		 session.save(ans1);
		 session.save(ans2);
		 session.save(ans3);
		t.commit();
		
	}
}
