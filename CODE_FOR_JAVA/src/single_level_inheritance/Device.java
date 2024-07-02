package single_level_inheritance;

public class Device {
	private String brand;
	private String model;
	
	public void turnOff() {
		System.out.println(" THE DEVICE IS TURN OFF ");
	}
	public void turnON() {
		System.out.println(" THE DEVICE IS TURN ON ");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Device(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public Device() {
		
	}
	@Override
	public String toString() {
		return "Device [brand=" + brand + ", model=" + model + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
    
}
