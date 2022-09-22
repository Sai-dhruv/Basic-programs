package arrays;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abca";
		char a[] = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<s.length();j++) {
				
				if(a[i] == a[j]) {
					
					System.out.println("true");
					
				}
				
			}
	
		}
		
		
		
		
		
		

	}

}
