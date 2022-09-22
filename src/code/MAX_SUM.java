package code;

public class MAX_SUM {
	
	public static void main(String[] args) {
		
		
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int MAX_SO_FAR = Integer.MIN_VALUE;
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
			max = max + a[i];
			if(MAX_SO_FAR < max) {
				MAX_SO_FAR = max;
			}
            if(max < 0) {
            	max = 0;
            }
		}
		System.out.println(MAX_SO_FAR);
		
		
		
		
	}
	
	
	

}
