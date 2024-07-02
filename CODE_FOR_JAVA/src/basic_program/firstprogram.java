package basic_program;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = " simran";
       System.out.println("   hello java"+msg);
  
       //28 may
       int age =23;
       char adhaar = 2345;
       
       if( age<18 || adhaar ==23445) {
    	   System.out.println(" you are eligible to vote ") ;     
       }
       else {
    	   System.out.println(" you are not eligible to vote ") ;   
       }
       
       //29may
       int a =0;
       Integer b = 897;
       System.out.println(a);
       System.out.println(b);
       
       String s = "234";
       s = s + 10;
       System.out.println(s);
       int cc = Integer.parseInt(s);
      cc = cc + 10 ;
      System.out.println(cc);
      
      
      
      //typecasting
      byte x = 23;
      byte y = 22;
      int add = x+y;
      System.out.println(add);
      
     
      byte chotivalue = (byte)add;
      System.out.println(chotivalue);
      
      int yy = 878787;
      byte as =(byte)yy;
      System.out.println(as);
      
      
      //is else if statement
      int myage = 13;
      if(age>=18) {
    	  System.out.println("eligible to vote");
    	  
      }
      else if(age==15) {
    	  System.out.println("go to school");
    	  
      }
      else {
    	  System.out.println("not eligible to vote");
      }
      
      
      //switch statement
      
      int day = 4 ;
      
      switch(day) {
      case 1:{
    	  System.out.println("monday");
    	  break;
      }
      case 2:{
    	  System.out.println("tuesday");
    	  break;
      }
      case 3:{
    	  System.out.println("wednesday");
    	  break;
      }
      default:{
    	  System.out.println(" default case");
      }
      }
      
      //day 31 may
      
      
    /*  System.out.println(23*1);
      System.out.println(23*2);
      System.out.println(23*3);
      System.out.println(23*4);
      */
     // int n=23;
     /* for(int i=1;i<=10;i++) {
    	  System.out.println(i);
      }
       */
      
  

	}

}
