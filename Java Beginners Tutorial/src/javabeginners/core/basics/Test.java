package javabeginners.core.basics;

public class Test {
	
	static int x;
	public static void main(String[] args) {
		Test t= new Test();
		t.add();
		int y=10;
		System.out.println(x);
	}
	private void add() {
		System.out.println("Message From Add Method");
	}
}
