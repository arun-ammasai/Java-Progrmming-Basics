package javabeginners.core.controlstatements;

public class IfElseExample {
	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 20 ;
		int num3 = 30 ;
		// Simple if condition
		// if (condition) {}
		// 10 10
		if(num1 >= num2) {
			System.out.println("Num1 is > Num2");
			System.out.println("Testing");
			}
		
		
		// if (condition) {} else {}
		if(num1 > num2) {
			System.out.println("Num1 is > Num2");
			}
		else {
			System.out.println("Num2 is Bigger");
		}
		
		// if (condition) {} else if(condition){} else if(condition) else {}
		
		 // 10 20 30
		if(num1 > num2) {
			System.out.println("num1 > num2");
		}else if(num2 > num3) {
			System.out.println("num2 > num3");
		}else if(num1 < num3) {
			System.out.println("num1 > num3");
		}else {
			System.out.println("No Match");
		}
}
}
// Notes
/* 
 1. If Else
 2. Switch Case
 3. For Loop
 4. While Loop
 5. do while
 6. Continue
 7. Break
  */
 