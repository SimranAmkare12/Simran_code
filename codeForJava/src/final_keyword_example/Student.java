package final_keyword_example;


	
	public class Student{
		
		int rollnumber ;
		String name ;
		final String college ;
		
		public Student(String name) {
			this.college = name ;
		}
		
		final
		
		@Override
		public String toString() {
			return "Student [rollnumber=" + rollnumber + ", name=" + name + ", college=" + college + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}



		public static void main(String[] args) {
			Student s = new Student(" nutan") ;
			s.name =  " niharika";
			s.rollnumber= 123;
			//s.college =" nutan";
			System.out.println(s);
		}
}

