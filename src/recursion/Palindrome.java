package recursion;

public class Palindrome {
	int sum =0;
	public boolean isPalidrome(int n){
	   	int temp = n;	
		if(n>0) {
			int rem = n % 10;
			sum = (sum * 10)+rem;
			isPalidrome(n/10);
		}
		System.out.println(sum);
        return sum==temp;		
	}
	
	public static void main(String[] args) {
		//Palindrome palindrome = new Palindrome();
		//boolean b = palindrome.isPalidrome(150);
		//System.out.println(b);
		System.out.println(palindromee(123321));
	}
	
	public static int reverseNumber(int num) {
		int reverseNum=0;
		while(num>0) {
			reverseNum=reverseNum*10+num%10;
			num=num/10;
		}
		return reverseNum;
	}
  public static boolean palindromee(int num) {
	  if(num==reverseNumber(num)) return true;
	  else return false;
  }
}

