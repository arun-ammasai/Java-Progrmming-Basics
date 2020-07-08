package javabeginners.core.oopsconcept;

public class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a Triangle");		
	}
	
	void paintColor() {
		System.out.println("Triangle Blue Color");
	}
	
	void addMethod() {
		System.out.println("Method Overidn by Triangle");
	}

}
