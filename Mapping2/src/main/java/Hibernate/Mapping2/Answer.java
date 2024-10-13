package Hibernate.Mapping2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="Answer2")
public class Answer {
    @Id
	private int a_id;
  
	private String ans ;
	@OneToOne
	private Question q ;
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	public Answer(int a_id, String ans) {
		super();
		this.a_id = a_id;
		this.ans = ans;
	}
	
	public Answer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Answer [a_id=" + a_id + ", ans=" + ans + "]";
	}	
	
}
