package arrays;
import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] = {1,4,6,-1,12,90,80};
		
		int a[] = {21,34,78,1,2,3,4,9};
		
		int min =0;
		int max =0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(min+"---"+max);
		Arrays.sort(b);
		System.out.println("Min :"+b[0]+" Max:"+b[b.length-1]);
		
	}

}
