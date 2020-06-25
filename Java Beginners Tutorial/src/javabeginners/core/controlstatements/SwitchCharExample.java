package javabeginners.core.controlstatements;

public class SwitchCharExample {

	public static void main(String[] args) {
		char num = 'e';
		SwitchCharExample obj = new SwitchCharExample();
		obj.switchMethod(num);
	}

	void switchMethod(char num) {
		switch (num) {
		case 'a':
			System.out.println("Sunday");
			break;
		case 'b':
			System.out.println("Monday");
			break;
		case 'c':
			System.out.println("Tuesday");
			break;
		case 'd':
			System.out.println("Wednesday");
			break;
		case 'e':
			System.out.println("Thursday");
			break;
		case 'f':
			System.out.println("Fridat");
			break;
		case 'g':
			System.out.println("Saterday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}

}
