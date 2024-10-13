package prototypeDesignPattern;

public class TestNC {

	public static void main(String[] args) {

		NetworkConnection nc = new NetworkConnection();
        nc.setIp("83765");
        nc.loadIMPData(); 
        
       
        
        
      //creating new object of network connection
        NetworkConnection nc2 = null ; 
        try {
        	
			nc2 = (NetworkConnection) nc.clone() ;
			NetworkConnection nc3 = (NetworkConnection) nc2.clone() ;//cloning  nc2 data to new object
			
			 System.out.println(nc);
			// changing  shallow 
			 nc.getDomain().remove(0);
			
			System.out.println(nc2);
			
			
			System.out.println(nc3);
		}
        catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
        
	}

}
