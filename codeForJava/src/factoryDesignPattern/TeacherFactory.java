package factoryDesignPattern;
public class TeacherFactory {

	public static Teacher getTeacher(String str) {
		if(str.trim().equalsIgnoreCase("English")){
	      return new English() ;
		}else if(str.trim().equalsIgnoreCase("Hindi")) {
			return new Hindi();
		}
		else {
			return null;
		}
		
	}
	
}
