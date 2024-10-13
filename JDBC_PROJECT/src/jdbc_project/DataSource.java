package jdbc_project;

import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSource {

	public static void main(String[] args)  {
	
		MysqlDataSource ds = new MysqlDataSource();
		ds.setURL("jdbc:mysql://localhost:3306/JDBC_PROJECT");
		ds.setUser("root");
		ds.setPassword("WJ28@krhps");
	
	       try {
	    	   Connection con = ds.getConnection();
	    	   
	    	//-------using prepared statement---------
	    /***	   
			PreparedStatement ps = con.prepareStatement("Insert into custumer values(5678,'Ajay','Indore') ");
			ps.executeUpdate();
		***/	
	    	   
	    	   //-----------------using statement--------
	    	   /***
	    	  Statement s = con.createStatement(); 
	    	 s.executeUpdate("Insert into custumer values(567878,'Vijay','Rewa')");
	    	 ***/
	    	   
	    	   //-----using batch with prepared statement--------
	    /***	   
	    	   PreparedStatement ps = con.prepareStatement("insert into Custumer values(?,?,?)");
	    	    ps.setInt(1, 5767);
	    	    ps.setString(2, "Manoj");
	    	    ps.setString(3, "Bhopal");
	    	    ps.addBatch() ;
	    	    
	    	    ps.setInt(1, 50767);
	    	    ps.setString(2, "Sanoj");
	    	    ps.setString(3, "kochi");
	    	    ps.addBatch() ;
	    	    
	    	    ps.executeBatch();
	    ***/
	    	   
	    	   //------------using batch with statement ------------------
		/***	
			Statement st = con.createStatement();
			st.addBatch("insert into Custumer values(1996,'Rajeev','Sehore')");
			st.addBatch("insert into Custumer values(17993,'Rajendra','Bhopal')");
			st.executeBatch();	
    	***/
	    	   System.out.println("data inserted");
		    } 
	       catch (Exception e) 
	       {
			e.printStackTrace();
		   }

	}

}
