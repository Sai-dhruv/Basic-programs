package recursion;

public class FactorialNumber {

	int factorial = 1;
	int fact(int n) {

		if(n ==0) {
			return 1;
		}

		return (n*fact(n-1));
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber factorialNumber = new FactorialNumber();
		int result =factorialNumber.fact(5);
		System.out.println(""+result);


	}

}
