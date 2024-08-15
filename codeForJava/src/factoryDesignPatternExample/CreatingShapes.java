package factoryDesignPatternExample;

public class CreatingShapes {

	public static void main(String[] args) {
		
		Shapes sp;
		int side;
		 sp = ShapeFactory.createShape("circle");
		 side = sp.draw();		 
         System.out.println(" Circle has "+side+" sides");
		
        sp =ShapeFactory.createShape("Triangle");
        side = sp.draw();		 
        System.out.println(" Triangle has "+side+" sides");
        
        sp =ShapeFactory.createShape("SqUare");
        side = sp.draw();		 
        System.out.println(" Sqaure has "+side+" sides");
       
	}

}
