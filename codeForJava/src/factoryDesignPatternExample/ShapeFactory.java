package factoryDesignPatternExample;

//this factory class create object based on arguments and requirement

public class ShapeFactory {   
	
	public static Shapes createShape(String str) {
		
		if(str.trim().equalsIgnoreCase("circle")) {    //if argument is circle return obj for Circle class
			return new  Circle() ;
		}
		else if(str.trim().equalsIgnoreCase("triangle")) { //if argument is triangle return obj for Triangle class
			return new Triangle() ;
		}
		else if(str.trim().equalsIgnoreCase("square")) {  //if argument is square return obj for Square class
			return new Square() ;
		}
		else {      //otherwise return null
			return null;
		}
	}

}
