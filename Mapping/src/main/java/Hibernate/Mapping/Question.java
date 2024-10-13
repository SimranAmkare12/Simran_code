package Hibernate.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int q_id ;
	private String question ;
	@OneToOne
	private Answer ans ;
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public Question(int q_id, String question, Answer ans) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.ans = ans;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", question=" + question + ", ans=" + ans + "]";
	}
	
	

}
