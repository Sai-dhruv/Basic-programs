package arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,6};
		int k= 7;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j] == k) {
					System.out.println(i+"----"+j);	
				}
			}
		}
	}
}


