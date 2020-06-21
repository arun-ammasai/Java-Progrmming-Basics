package javabeginners.core.basics;

public class FirstJavaProgram { // start of class
	public static void main(String args[]) { // start of main method
		System.out.println("Hello World");
		String s = "10.25";
		int y= Integer.parseInt(s);
		int x = 20;		
		System.out.println(s+x);
		
		s = "hello";
		x = 25;
	}// end of main method
}// end of class

// compile - javac FirstJavaProgram.java
// run - java FirstJavaProgram

