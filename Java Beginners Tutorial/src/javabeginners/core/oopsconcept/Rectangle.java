package javabeginners.core.oopsconcept;

public class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a Rectangle");
	}
	void addMethod() {
		System.out.println("Method Overiden by Rectangle");
	}
	
	static void notModify() {
		System.out.println("Message from Static Method in Rectangle");
	}

}
