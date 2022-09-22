package arrays;

public class OccuranceAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,22,3,3,3,5,5,5,5,6};
        
		int count = logic(a, 5);
		System.out.println(count);

	}

	private static int logic(int a[],int n) {

		int count = 0;
		for(int i=0;i<a.length;i++) {
               if(a[i] == n) {
            	   count++;
               }
		}
     return count;
	}

}
