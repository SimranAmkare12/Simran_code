package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	private int answer_id;
	private String Answer;
	@ManyToOne
	private Questions question;
	public Answers() {
		super();
	}
	public Answers(int answer_id, String answer, Questions question) {
		super();
		this.answer_id = answer_id;
		Answer = answer;
		this.question = question;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	
	
	

}
