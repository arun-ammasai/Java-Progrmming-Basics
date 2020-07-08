package javabeginners.core.oopsconcept;

public class ShapeAbstractTest {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		circle.addMethod();
		circle.notModify();
		System.out.println("===================");
		Shape rectangle = new Rectangle();
		Rectangle r = new Rectangle();
		rectangle.draw();
		rectangle.addMethod();
		rectangle.addMethod1();
		//rectangle.myName = "Nancy";
		System.out.println("Variable Data :"+rectangle.myName);
		//rectangle.x = 50;
		System.out.println("Variable Int Data :"+rectangle.x);
		r.notModify();
		
		/*Shape triangle = new Triangle();
		triangle.draw();
		triangle.addMethod();*/
		
		final int i=10;
		System.out.println("Value I:"+i);
	}
}
