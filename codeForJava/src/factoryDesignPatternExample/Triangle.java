package factoryDesignPatternExample;

public class Triangle  implements Shapes{ // class that implements shapes

	@Override
	public int draw() {       //providing implementation

         System.out.println("creating Triangle...");
		return 3;
	}
	

}
