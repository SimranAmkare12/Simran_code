package jdbc_project;
import java.sql.*;
import java.util.Scanner;
public class Custumer {

	public static void main(String[] args) throws SQLException {
		
		System.out.println(" hello");
		PreparedStatement ps  = null;
		Scanner sc = new Scanner(System.in);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_PROJECT", "root","WJ28@krhps");		
			System.out.println("connection dnoe");
			
			
	//	   ps  = con.prepareStatement("Create Table Custumer (id int ,name varchar(30),address varchar(30))");
		//   ps.executeUpdate();
			
//			ps = con.prepareStatement("delete from Custumer where name  =null");
//			ps.executeUpdate();
			
//			ps = con.prepareStatement(" insert into Custumer values(?,?,?)");
//			ps.setInt(1, 116);
//			ps.setString(2,"Reena");
//			ps.setString(3, "Ujjain ");
//			ps.executeUpdate() ;
			
//			int count = 0 ;
//			while(count < 5) {
//				System.out.println("Enter your id");
//				int id = sc.nextInt();
//				System.out.println("Enter your name");
//				String name = sc.nextLine() ;
//				System.out.println("Enter your city ");
//				String address = sc.nextLine();
//				
//				ps = con.prepareStatement("insert into Custumer values(id,name,address)");
//			    ps.executeUpdate();
//			    count++;
//			}

			ps = con.prepareStatement("select * from Custumer");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String city = rs.getString("address");
				
				System.out.println("\nId :"+id +"\nName :"+name+"\nAddress :"+city);
				System.out.println("=================================================");
			} 
			ps.executeQuery();
			
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
