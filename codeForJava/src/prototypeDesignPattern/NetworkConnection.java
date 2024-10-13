package prototypeDesignPattern;
import java.util.*;

public class NetworkConnection implements Cloneable{
	
	
	private String ip ;
	private String impData ;
	
	private List<String> Domain = new ArrayList<>();
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImpData() {
		return impData;
	}
	public void setImpData(String impData) {
		this.impData = impData;
	}

	
	public void loadIMPData() {
		this.impData  = " very very imp datta" ;
		try {
			
			Domain.add("www.facebook.com");
			Domain.add("www.book.com");
			Domain.add("www.face.com");
			Domain.add("www.google.com");
			
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return this.impData +" : "+this.ip +" : "+this.Domain;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//logic for deep clone
		NetworkConnection nc = new NetworkConnection();
		nc.setIp(this.getIp());
		nc.setImpData(this.impData);
		
		for(String d : this.getDomain()) {
			nc.getDomain().add(d);
		}
		
		return nc;
	}
	public List<String> getDomain() {
		return Domain;
	}
	public void setDomain(List<String> domain) {
		Domain = domain;
	}
	
	
}
