package javabeginners.core.oops;

public class ConstructorExample1 {
	
	String name;	
	String email;
	int phone;
	
	ConstructorExample1(){
		name = "Akil";
		System.out.println(name);
	}
	
	ConstructorExample1(String name){
		this.name = name;
		System.out.println(name);
	}
	
		
	public ConstructorExample1(String name, String email, int phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		System.out.println("Name :"+name +" / Email :"+email +" / Phone :"+phone);
	}

	public static void main(String[] args) {
		new ConstructorExample1();
		new ConstructorExample1("Akil");
		new ConstructorExample1("Arun");
		new ConstructorExample1("Nancy");
		new ConstructorExample1("Akil","akil@gmail.com",1234567);
	}

}
