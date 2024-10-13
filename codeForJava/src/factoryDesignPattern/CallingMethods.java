package factoryDesignPattern;

public class CallingMethods {

	public static void main(String[] args) {
		Teacher t1 = TeacherFactory.getTeacher("English");
        t1.subject();
        int s1 = t1.salary() ;
        System.out.println(s1);
        
        System.out.println();
        Teacher t2 = TeacherFactory.getTeacher("hindi  ");
        t2.subject();
        int s2 = t2.salary() ;
        System.out.println(s2);
	}

}
