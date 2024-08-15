package factoryDesignPatternExample;

public class Square   implements Shapes {   //class that implements shapes

	@Override
	public int draw() {      //providing implementation

     System.out.println("Creating square....");
		return 4;
	}

}
