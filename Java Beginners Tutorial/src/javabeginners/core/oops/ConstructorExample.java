package javabeginners.core.oops;

public class ConstructorExample {

	ConstructorExample() {
		System.out.println("Default Constructor");
	}
	
	ConstructorExample(int x){
		System.out.println("X Value is :"+x);
	}
	
	ConstructorExample(int x,int y){
		System.out.println("Total Value is :"+(x+y));
	}
	

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample(10);
		new ConstructorExample(10,20);
		new ConstructorExample();
	}

	void add() {
		System.out.println("Message From Add Method");
	}

}
