package javabeginners.core.basics;

abstract class A{
	abstract void firstMethod();
	
	void secondMethod() {
		System.out.println("Second Method");
		firstMethod();
	}
}
public class Test extends A{

	@Override
	void firstMethod() {
		System.out.println("Message From First Method");		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		//t.firstMethod();
		t.secondMethod();
	}
	
	
}
