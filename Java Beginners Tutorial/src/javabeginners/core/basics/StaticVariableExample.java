package javabeginners.core.basics;

public class StaticVariableExample {
	public static int myClassVaraible =10;
	public static void main(String[] args) {
		StaticVariableExample obj1 = new StaticVariableExample();
		StaticVariableExample obj2 = new StaticVariableExample();
		StaticVariableExample obj3 = new StaticVariableExample();
		System.out.println(obj1.myClassVaraible);
		System.out.println(obj2.myClassVaraible);
		System.out.println(obj3.myClassVaraible);
		// myClassVaraible = 25; // this will impact all objects 
		obj1.myClassVaraible = 25;
		myClassVaraible = 25 ;
		
		System.out.println(obj1.myClassVaraible);
		System.out.println(obj2.myClassVaraible);
		System.out.println(obj3.myClassVaraible);
		
		System.out.println("Direct Access :"+myClassVaraible);
	}
}
