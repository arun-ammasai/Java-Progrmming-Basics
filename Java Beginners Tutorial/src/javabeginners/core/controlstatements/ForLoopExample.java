package javabeginners.core.controlstatements;

public class ForLoopExample {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				add();
			}
			else {
				System.out.println(i);
			}
		}
		for(int i=50;i>=1;i--) {
			//System.out.println(i);
		}
	}
	
	static void add() {
		System.out.println("Number 5 has been crossed");
	}

}
// Notes 
/*
	Syntax
		for(inital value declaration; condition ; increment/decrement){
			statement 
		}
*/