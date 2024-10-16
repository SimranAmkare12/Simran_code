package Hibernate.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
    private int ans_id ;
    private String ans ;
 //  @OneToOne
    private Question question;
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer(int ans_id, String ans) {
		super();
		this.ans_id = ans_id;
		this.ans = ans;
	}
	public Answer() {
		super();
	}
	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", ans=" + ans + "]";
	}
    
}
