package factoryDesignPatternExample;

public class Circle implements Shapes{ //class that implements shapes

	@Override
	public int  draw() {    //providing implementation
		System.out.println("Creating circle...");
		return 0;
	}

}
