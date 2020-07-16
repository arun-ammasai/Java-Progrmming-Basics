package javabeginners.core.oopsconcept;

class Show {
	void display() {
		System.out.println("Messgae from Display method");
	}

	void display(int x) {
		System.out.println("Int Value :"+x);
	}

	void display(double y) {
		System.out.println("Double Value :"+y);
	}
	public static void main(String[] args) {
		Show s = new Show();
		s.display();
	}
}

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Show s = new Show();
		s.display();
		s.display(10);
		s.display(10.5);
	}
}
