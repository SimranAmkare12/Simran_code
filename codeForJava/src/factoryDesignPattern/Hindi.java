package factoryDesignPattern;

public class Hindi implements Teacher {

	@Override
	public int salary() {
		System.out.println("Getting salary of Hindi teacher-");
		return 30000 ;
	}

	@Override
	public void subject() {
		System.out.println("Hello student iam a Hindi Teacher ! ");
		
	}

}
