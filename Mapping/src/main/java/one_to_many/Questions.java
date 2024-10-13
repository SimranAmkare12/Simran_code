package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Questions {
	@Id
	private int question_id;
	private String question;
	@OneToMany
	private List<Answers>answer;
	//constructor
	public Questions() {
		super();
	}
	public Questions(int question_id, String question, List<Answers> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}
	

}
