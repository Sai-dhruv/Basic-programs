package TCS;

import java.util.Arrays;
import java.util.Iterator;

public class Test {

  public static void main(String []args){ 
		String intialString = "gde";
		String secondString = "bega"; 
		char[] ch1 = intialString.toCharArray();
		char[] ch2 = secondString.toCharArray(); 
		
		for(int i=0; i<ch1.length; i++) { 
			for(int j=0; j<ch2.length; j++) { 
				
				if(ch1[i] == ch2[j]) {
					System.out.println(""+ ch2[j]+":" +i +","+ j);
					
				}
				}
			}
		}
	}
		
		

