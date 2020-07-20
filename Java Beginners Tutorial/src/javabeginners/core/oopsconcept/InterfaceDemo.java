package javabeginners.core.oopsconcept;

//public class InterfaceDemo implements Interface1,Interface2,Interface3{
public class InterfaceDemo implements Interface1{
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.add();
		id.i2Method();
		id.i3Method();
		//id.x=20;
	}
	
	public void add() {
		System.out.println("Message From Add Method");
	}

	@Override
	public void i2Method() {
		System.out.println("Message From Add i2Method");		
	}

	@Override
	public void i3Method() {
		System.out.println("Message From Add i3Method");		
	}
}
