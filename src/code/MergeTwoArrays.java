package code;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,0,0,0};
		int[] b = {2,3,4};
		int[] c = new int[a.length + b.length];
		int[] d = new int[a.length + b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		
		
		
		
		System.out.println(Arrays.toString(c));
		

	}

}
