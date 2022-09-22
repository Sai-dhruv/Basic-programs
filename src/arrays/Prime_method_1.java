package arrays;

public class Prime_method_1 {
	static boolean  isPrime(int n){
		if(n ==0 || n == 1) return false;
		for(int j=2;j<n ;j++) {
			if( n % j == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("prime numbers");
		for(int i=0;i<20;i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
			}
		}
	}
}
