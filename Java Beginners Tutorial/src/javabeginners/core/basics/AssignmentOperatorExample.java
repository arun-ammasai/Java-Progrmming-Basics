package javabeginners.core.basics;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		num2=num1;
		System.out.println("Step 1:"+num2);// 10
		
		num2 +=num1;//num2 = num1+num2
		System.out.println("Step 2:"+num2);// 20
		
		num2 -=num1;//num2 = num1-num2
		System.out.println("Step 3:"+num2);// 10
		
		num2 *=num1;
		System.out.println("Step 4:"+num2);// 100
		
		num2 /=num1;
		System.out.println("Step 5:"+num2);// 10
		
		num2 %=num1;
		System.out.println("Step 6:"+num2);// 0
	}
}
