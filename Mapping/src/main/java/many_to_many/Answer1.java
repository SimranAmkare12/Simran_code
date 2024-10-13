package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Answer1 {
  @Id
	private int answer_id ;
	private String answer ;
	@ManyToMany
	private List<Question1> question ;
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<Question1> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question1> question) {
		this.question = question;
	}
	public Answer1(int answer_id, String answer, List<Question1> question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}
	public Answer1() {
		super();
	}
	@Override
	public String toString() {
		return "Answer1 [answer_id=" + answer_id + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
}
