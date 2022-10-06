/**
 * 
 */
package strings;


/**
 * @author Sai Krishna
 *
 */
public class Reverse_each_one {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="My Name is India";
		String k[] = s.split(" ");
        for(int i=0; i<k.length;i++) {
        	String value = rev(k[i]);
        	System.out.print(" "+value);
        }
	}
	public static String reverse(String value) {
		StringBuffer buffer = new StringBuffer(value);
		return buffer.reverse().toString();
	}
	
	public static String rev(String value) {
		String revValue = "";
		char ch ;
		for(int i=0;i<value.length();i++) {
			ch = value.charAt(i);
			revValue = ch + revValue;
		}
		return revValue;
	}
	

}
