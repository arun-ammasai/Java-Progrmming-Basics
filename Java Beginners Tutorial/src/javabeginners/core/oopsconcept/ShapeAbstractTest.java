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
		r.notModify();
		
		/*Shape triangle = new Triangle();
		triangle.draw();
		triangle.addMethod();*/
	}
}
