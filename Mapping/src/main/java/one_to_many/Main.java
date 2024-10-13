package one_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("one_to_many.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		//creating objects
		
		Questions que = new Questions();
		que.setQuestion_id(1);
		que.setQuestion("what is java");
		
		
		Answers ans = new Answers();
		ans.setAnswer_id(111);
		ans.setAnswer("it is pl");
		
		Answers ans2 = new Answers();
		ans2.setAnswer_id(112);
		ans2.setAnswer("its is interpreted");
		
		Answers ans3 = new Answers();
		ans3.setAnswer_id(113);
		ans3.setAnswer("it is high level language");
		
		ArrayList<Answers> array = new ArrayList<>();
		array.add(ans3);
		array.add(ans2);
		array.add(ans);
		
		que.setAnswer(array);
		ans.setQuestion(que);
		ans2.setQuestion(que);
		ans3.setQuestion(que);
		
		session.save(que);
		session.save(ans);
		session.save(ans2);
		session.save(ans3);
		
		t.commit();
		
		
		
		
	}

}
