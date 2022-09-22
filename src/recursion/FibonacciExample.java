package recursion;

public class FibonacciExample {
	int n1 = 0; int n2 = 1; int n3 ; 	

	void check(int count) {
		if(count>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			check(count-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciExample example = new FibonacciExample();
		example.check(10);
		
	}

}
