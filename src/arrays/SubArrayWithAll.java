package arrays;

public class SubArrayWithAll {
	public static void main(String[] args) {
		int a[] = {1,2,3,7,5}; // 3
		int result = 12;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j] == result) {
					System.out.println(i+"--"+j);
				}
			}
		}
	}
}
