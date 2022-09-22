package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class NextSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,2,1,5,3};
		int result[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int next = -1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i] >a[j]) {
					next = a[j];
					break;
				}
			}
			result[i] = next;
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
