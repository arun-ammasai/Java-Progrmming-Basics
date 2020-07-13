package javabeginners.core.oopsconcept;

class Father1 {
	String process = "Home";

	void room(String name) {
		System.out.println("This Home belong to " + name);
	}
}

class Akil1 extends Father1 {
	void akilMethod() {
		System.out.println("Message From Akil");
	}
}

class Ashwanth1 extends Father1 {
	void ashwanthMethod() {
		System.out.println("Message From Aswanth");
	}
}

public class HierarchInheriExample extends Ashwanth1 {
	public static void main(String[] args) {
		HierarchInheriExample obj = new HierarchInheriExample();
		obj.room("Your Father");
		obj.ashwanthMethod();
		System.out.println(obj.process);
	}
}
