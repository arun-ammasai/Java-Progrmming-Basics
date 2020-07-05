package javabeginners.core.oopsconcept;

public class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a Triangle");		
	}
	
	void addMethod() {
		System.out.println("Method Overidn by Triangle");
	}

}
