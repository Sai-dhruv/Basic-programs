package arrays;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		//int a[] = {13,7,6,12};
		int a[] = {2,6,3,8,15};
		int a1[] = new int[a.length];
		for(int i =0;i<a.length;i++) {
			int next = -1;
			for(int j=i+1; j<a.length;j++) {
				if(a[i] < a[j]) {
					next = a[j];
					break;
				}
			}
			a1[i] = next;
			//System.out.println(i+":"+next);
		}
		System.out.println(Arrays.toString(a1));
	}
}
