package static_example;

public class StaticBlock {
	
	int a = 10;
	
	static {
		System.out.println("I am from static block");
	}
	static void method() {
		System.out.println("I am from static method..");
	}
	public static void main(String[] args) {
		System.out.println("I am from main method");
		method();
	}

}
