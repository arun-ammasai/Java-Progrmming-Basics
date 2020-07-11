package javabeginners.core.oopsconcept;

public class StudentDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudentName("Akil");
		System.out.println("Student Name is :"+stu.getStudentName());
		
		Student stu1 = new Student();
		stu1.setStudentName("Arun");
		System.out.println("Student Name is :"+stu1.getStudentName());
	}

}
