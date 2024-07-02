package Bank_override;

public class Bank {
	
	double rate_of_interest;
		
	protected double rate() {
		rate_of_interest =5;
		return rate_of_interest;
	}

}
