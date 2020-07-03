package javabeginners.core.oopsconcept;

public class AbstractExample {
	public static void main(String[] args) {
		Animal obj1 = new Dog();
		obj1.makeSound();
		Animal obj2 = new Cat();
		obj2.makeSound();
		obj2.add();
		
	}
}
