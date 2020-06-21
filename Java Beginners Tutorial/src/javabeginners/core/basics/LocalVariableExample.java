package javabeginners.core.basics;

public class LocalVariableExample {
	public static void main(String[] args) {
		int a =10 , b=20;
		// int a =10 ; int b =20;
		int c = a+b;
		System.out.println("Total is :"+c);
	}
	
	void addMethod(int x, int y) {
		int c = x+y;
		System.out.println(c);
	}
}
