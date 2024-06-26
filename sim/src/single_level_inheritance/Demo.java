package single_level_inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		System.out.println(" showing default values ....");
		System.out.println(l);
		System.out.println();
		
		Laptop l1 = new Laptop();
		l1.setBrand("hp..");
		l1.setModel("i5 2nd generation");
		l1.setBatterylife("- has good battery life..");
		
		System.out.println();
		System.out.println(" The brand of laptop "+l1.getBrand());
		System.out.println(" The model of laptop  "+l1.getModel());
		System.out.println(" The batterylife of laptop "+l1.getBatterylife());
		
		System.out.println();
		System.out.println("Now calling method of class");
		l1.showBatteryStatus();
		l1.turnOff();
		l1.turnON();

	}

}
