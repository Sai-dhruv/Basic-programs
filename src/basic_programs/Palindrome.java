package basic_programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 151;
		
		int temp = n;
		
		int sum =0;
		
		while(n>0) {
			
			int rem = n % 10;
			sum = (sum * 10)+rem;
			n = n/10;
		}
      System.out.println(sum==temp);		

      sum = 0;
      n= 151;
      for(int i=n; i>0;i = i/10) {
    	  int rem = i % 10;
			sum = (sum * 10)+rem;
      }
      
      
      System.out.println(sum==temp);		
	}

}
