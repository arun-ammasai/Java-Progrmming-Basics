package javabeginners.core.oopsconcept;

public class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a Rectangle");
	}
	void paintColor() {
		System.out.println("Rectangle Green Color");
	}
	void addMethod() {
		System.out.println("Method Overiden by Rectangle");
	}
	
	static void notModify() { // you can only use not allowed to modify
		System.out.println("Message from Static Method");
	}

}
