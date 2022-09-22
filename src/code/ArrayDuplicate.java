package code;

import java.util.Arrays;

public class ArrayDuplicate {

	public static boolean  isDuplicate(int[] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
				if(a[i] == a[i+1]) {
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4};
		boolean b = isDuplicate(a);
			System.out.println("---------------"+b);
		}
	}
