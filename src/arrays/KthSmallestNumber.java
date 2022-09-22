package arrays;
import java.util.Arrays;

public class KthSmallestNumber {

	public static void main(String[] args) {

		int a[] = {7,10,4,3,6,20,15};
		
		int smallestNumber = logic(a, 3);
		System.out.println(smallestNumber);
	}

	private static int logic(int a[],int k) {
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[k-1];
	}
}
