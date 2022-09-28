package recursion;

public class PrimeNumber {
	public void primeNumbers(int n,int k) {
		if(n<k) {
			int count = 0;
			for(int i=2;i<= n/2;i++) {
				if( n%i == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.print(" "+n);
			}
			primeNumbers(n+1,k);
		}
	}
	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
		number.primeNumbers(2,20);
	}
}
