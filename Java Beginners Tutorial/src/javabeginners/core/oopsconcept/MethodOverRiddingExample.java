package javabeginners.core.oopsconcept;

class Show1{
	void display(int x) {
		System.out.println("Messgae from Parent Class:"+x);
	}
}
class Show2 extends Show1{
	void display(int x) {
		System.out.println("Messgae from Parent Show2 Class:"+x);
	}
}
public class MethodOverRiddingExample {
	void display(int x) {
		System.out.println("Messgae from Child Class :"+x);
	}
	
	public static void main(String[] args) {
		Show2 obj = new Show2();
		obj.display(10);
	}
}

