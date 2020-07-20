package javabeginners.core.oopsconcept;

public abstract class Shape {
	abstract void draw(); // u need to provide the implemention
	
	abstract void paintColor();
	
	final String myName="Sam";
	final int x =25;
	
	void addMethod() { // you can use or override
		System.out.println("Message from Add Method");
	}	
	
	final void addMethod1() { // you can use or override
		System.out.println("Message from Add Method Final");
	}	
	
	static void notModify() { // you can only use not allowed to modify
		System.out.println("Message from Static Method");
	}
	
}
