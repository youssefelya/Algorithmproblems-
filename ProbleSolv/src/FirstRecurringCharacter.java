
public class FirstRecurringCharacter {

	/*iven a string, return the first recurring character in it, or null if there is no recurring character.
For example, given the string "acbbac", return "b". Given the string "abcdef", return null.* 
	 */
	
	public static int GetNum(char c) {return Character.getNumericValue(c)-10;}
	public static String FirstRec(String s) {
		int[] arr=new int[28]; 
		for(int i=0;i<s.length();i++) {
			arr[GetNum(s.charAt(i))]++;
			if(arr[GetNum(s.charAt(i))]==2){return ""+s.charAt(i); }
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		String s="acbbac";
		System.out.println("The first Recurring is :  "+FirstRec(s));
		

	}

}
