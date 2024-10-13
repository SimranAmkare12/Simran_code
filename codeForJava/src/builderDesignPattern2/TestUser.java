package builderDesignPattern2;

public class TestUser {

	public static void main(String[] args) {
		User u1 = new User.UserBuilder().setU_id("123").setU_name("sim").build();
		System.out.println(u1);
		
		

		
	}

}
