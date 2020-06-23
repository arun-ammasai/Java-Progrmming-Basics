package javabeginners.core.basics;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//&& || !
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 and b2:" +(b1 && b2)); // false
		System.out.println("b1 or b2:" +(b1 || b2)); // true
		System.out.println("!b1 and b2:" +!(b1 && b2)); // true
	}

}
