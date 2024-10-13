package factoryDesignPattern;

public class English implements Teacher{



	@Override
	public int salary() {
		System.out.println("Getting salary of English teacher-");
		return 20000 ;
	}

	@Override
	public void subject() {
		System.out.println("Hello student iam a English Teacher ! ");
	}

}
