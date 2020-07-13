package javabeginners.core.oopsconcept;

class Father{
	
	String process = "Home";
	
	void room(String name) {
		System.out.println("This room belong to "+name);
	}
}
public class InheritanceExample extends Father{
	public static void main(String[] args) {
		InheritanceExample obj = new InheritanceExample();
		obj.room("Akil");
		System.out.println(obj.process);
	}
}
