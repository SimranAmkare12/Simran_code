package single_level_inheritance;

public class Laptop extends Device {
       
	     private String batterylife ;
	     public void showBatteryStatus() {
	    	 System.out.println(" showing battery status.... ");
	     }
		public String getBatterylife() {
			return batterylife;
		}
		public void setBatterylife(String batterylife) {
			this.batterylife = batterylife;
		}
		public Laptop(String brand, String model, String batterylife) {
			super(brand, model);
			this.batterylife = batterylife;
		}
	     
		public Laptop() {
			
		}
		@Override
		public String toString() {
			return "Laptop [batterylife=" + batterylife + ", getBatterylife()=" + getBatterylife() + ", getBrand()="
					+ getBrand() + ", getModel()=" + getModel() + ", toString()=" + super.toString() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}
		
}
