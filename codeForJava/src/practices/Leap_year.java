package practices;
import java.util.*;

public class Leap_year {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
			if(year%4 == 0)
			{
				System.out.println("leap year");
			}
			else {
				System.out.println("not leap year");
			}

	}

}
