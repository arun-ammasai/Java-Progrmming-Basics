package javabeginners.core.controlstatements;

public class TestClass {
	public static void main(String[] args) {
		TestClass obj = new TestClass();
		for (int i = 1; i <=7; i++) {
			 obj.switchMethod(i);
		}
	}
	
	void switchMethod(int a) {
		switch(a) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Fridat");
			break;
		case 7:
			System.out.println("Saterday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}

}
