package javabeginners.core.oopsconcept;

class Daddy{
	
	String process = "Home";
	
	void room(String name) {
		System.out.println("This Home belong to "+name);
	}
}

class Akil extends Daddy{
	void akilMethod() {
		System.out.println("Message From Akil");
	}
}
class Ashwanth extends Akil{
	void ashwanthMethod() {
		System.out.println("Message From Aswanth");
	}
}
public class MultiLevelInheriExample extends Ashwanth{
	public static void main(String[] args) {
		MultiLevelInheriExample obj = new MultiLevelInheriExample();
		obj.room("Your Father");
		obj.akilMethod();
		obj.ashwanthMethod();
		System.out.println(obj.process);		
		
	}
}
