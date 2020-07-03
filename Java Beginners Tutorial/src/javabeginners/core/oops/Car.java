package javabeginners.core.oops;

public class Car {
	
	String brand;
	String color;
	int model;
	
	//default constructor
	
	// User constructor
	Car(String brand ,String color , int model){
		System.out.println("Constructor Called 3 Parameter");
		this.brand = brand;
		this.color = color;
		this.model = model;
	}
	
	public static void main(String[] args) {
		
		
		Car obj = new Car("Ford","Red",8795);
		Car obj1 = new Car("Ford","Black",8796);
		System.out.println(obj1.model);
		
		/*Car obj = new Car();
		obj.brand = "Ford";
		obj.color ="Red";
		obj.model = 8795;
		
		Car obj1 = new Car();
		obj1.brand = "Ford";
		obj1.color ="Black";
		obj1.model = 8796;
		
		
		System.out.println(obj1.brand);
		System.out.println(obj1.color);*/
	}

}
