package builderDesignPattern2;

public class User {

	private String u_name ;
	private String u_id ;
	private String u_email ;
	
	private User(UserBuilder builder) {
		
		this.u_id = builder.u_id ;
		this.u_email = builder.u_email ;
		this.u_name = builder.u_name ;
		  
	}

	public String getU_name() {
		return u_name;
	}


	public String getU_id() {
		return u_id;
	}

	public String getU_email() {
		return u_email;
	}
	
	

	
   @Override
	public String toString() {
		return this.u_email +" : " +this.u_id + " : " +this.u_name ;
	}




public static class UserBuilder{
	   
	    private String u_name ;
		private String u_id ;
		private String u_email ;
		
		public UserBuilder() {
			
		}
		
		public UserBuilder setU_name(String u_name) {
			this.u_name = u_name;
			return this ;
		}
		
		public UserBuilder setU_id(String u_id) {
			this.u_id = u_id;
			return this ;
		}
		
		public UserBuilder setU_email(String u_email) {
			this.u_email = u_email;
			return this ;
		}
		
		public User build() {
			
			User user = new User(this) ;
			return user;
			
		}
		
	   
   }
	
	
}
