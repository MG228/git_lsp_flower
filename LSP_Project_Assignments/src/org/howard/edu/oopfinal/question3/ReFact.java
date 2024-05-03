package org.howard.edu.oopfinal.question3;

public class ReFact {
	public static Shapes createShapes(String type) {
		if (type.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
