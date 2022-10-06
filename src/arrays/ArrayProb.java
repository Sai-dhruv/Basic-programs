package arrays;

/**
 * @author Sai Krishna
 *
 */
public class ArrayProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,4};
		int target = 5;
		prob(a, 0);
		
		
	}

	
	private static void prob(int[] a, int target) {
		
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(target == a[i]+ a[j]) {
					System.out.println(i+"--"+j);
				}
			}
		}
	}
}
