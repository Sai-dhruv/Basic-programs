package wipro;

class Parent {
	void m1() {
		System.out.println("From parent");
	}
	public void m2() {
		System.out.println("M2 from parent");
	}
}

class child extends Parent{
	public void m1() {
		System.out.println("From child");
	}
	public void m2() {
		System.out.println("M2 from child");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Parent p = new child();
		p.m1();
	}
}

