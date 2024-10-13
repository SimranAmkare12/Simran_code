package jdbc_project;
import java.sql.*;
import java.util.Scanner;

public class Batching {
      
	
	
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_PROJECT", "root","WJ28@krhps");		
			System.out.println("connection dnoe");
			
			
			//---------By using Statement-----------
			
	   /***		
		Statement	s =  con.createStatement();
		s.addBatch("insert into Custumer values(176,'Mohan','Sehore')");
		s.addBatch("insert into Custumer values(173,'Rajendra','Bhopal')");
		s.addBatch("insert into Custumer values(176,'Asha','Agra')");
		int[]count = s.executeBatch();
		for(int i : count) {
		System.out.println(i+"data inserted succesfully  !");
		}
		***/
			
	//------- by using prepared statement----------------	
			
		/***	
		PreparedStatement ps = con.prepareStatement("insert into Custumer values(?,?,?)");
		ps.setInt(1, 100);
		ps.setString(2, "Ravi");
		ps.setString(3, "Indore");
		ps.addBatch();
		
		ps.setInt(1, 190);
		ps.setString(2, "kavita");
		ps.setString(3, "Indore");
		ps.addBatch();
		
		ps.executeBatch();
		System.out.println("done");
		***/
			
			//-------------by taking user input---------------
			/***
			PreparedStatement ps = con.prepareStatement("insert into Custumer values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			int c= 0 ;
			while(c < 3 ) {
				System.out.println("enter id");
				int id = sc.nextInt();
				ps.setInt(1, id);
				
				System.out.println("enter name");
				String name = sc.nextLine() ;
				ps.setString(2, name);
				
				System.out.println("enter Address");
				String Add = sc.nextLine() ;
				ps.setString(3, Add);
				
             
				ps.addBatch(); 
				  c++;
			}
		   ps.executeBatch();
			***/
		
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
