package javabeginners.core.oopsconcept;

public abstract class Shape {
	abstract void draw(); // u need to provide the implemention
	void addMethod() { // you can use or override
		System.out.println("Message from Add Method");
	}
	
	static void notModify() { // you can only use not allowed to modify
		System.out.println("Message from Static Method");
	}
}
