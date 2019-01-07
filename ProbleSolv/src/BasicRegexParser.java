import java.util.regex.Matcher;

public class BasicRegexParser {
	
	static int[] textval(String s) {
		int[]arr=new int[27];
		for(char c:s.toCharArray()) {
			arr[Character.getNumericValue(c)-10]++;
		}
		return arr;
	} 
	  
	  static boolean isMatch(String text, String pattern) {

		  
	    return false;
	  }

	public static void main(String[] args) {
		System.out.println(" "+Character.getNumericValue('z'-10));
     	
	}

}
