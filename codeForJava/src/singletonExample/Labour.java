package singletonExample;

public class Labour {
	//eager way to create singleton object
	
	private static Labour labour = new Labour();
	
	public static Labour getobject() {
		
		return labour;
	}
	

}
