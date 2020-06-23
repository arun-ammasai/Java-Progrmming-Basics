package javabeginners.core.basics;

public class InstanceVariableExample {
	public int instanceVariable =10;
	
	void test() {
		System.out.println(instanceVariable);
	}
	
	public static void main(String[] args) {
		InstanceVariableExample obj1 = new InstanceVariableExample();
		InstanceVariableExample obj2 = new InstanceVariableExample();
		InstanceVariableExample obj3 = new InstanceVariableExample();
		System.out.println(obj1.instanceVariable);
		System.out.println(obj2.instanceVariable);
		System.out.println(obj3.instanceVariable);
		
		obj1.instanceVariable = 25;
		
		System.out.println(obj1.instanceVariable);
		System.out.println(obj2.instanceVariable);
		System.out.println(obj3.instanceVariable);
	}

}
