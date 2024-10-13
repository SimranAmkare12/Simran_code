package builderDesignPattern;

public class Computer {

	private String HDD ;
	private String  RAM ;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(Builder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	static class Builder{
		private String HDD ;
		private String  RAM ;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		
		public Builder(String hdd , String ram) {
			this.HDD = hdd ;
			this.RAM = ram ;
		}
		
		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		

		public Computer build(){
			return new Computer(this);
		}

		
		
	}
	
}
