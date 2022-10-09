package arrays;

public class PeekElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3};
		int n = 3;
		int result = 0;

		for(int i=0;i<arr.length;i++){

			if(n>arr[i]){
				result = i;
			}
		}
		System.out.println(result);
	}
}

