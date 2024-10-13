package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Question1 {
	@Id
	private int question_id ;
	private String question ;
	@ManyToMany
	private List<Answer1> answer;
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
	public List<Answer1> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}
	public Question1() {
		super();
	}
	public Question1(int question_id, String question, List<Answer1> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question1 [question_id=" + question_id + ", question=" + question + ", answer=" + answer + "]";
	} 
	
	

}
