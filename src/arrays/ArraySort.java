package arrays;
import java.util.Arrays;

/**
 * @author Sai Krishna
 *
 */
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {4,5,2,7,5,8};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp = a[j];
					a[j] =a[i];
					a[i] = temp;
				}
			}
		}
System.out.println(Arrays.toString(a));
	}

}
