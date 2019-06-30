package String_second_year;

/*1 1 Implement an algorithm to determine if a string has all unique characters What if
you can not use additional data structures?*/

public class OneCharacters {
	
	static boolean isUniqueChars(String s) {
		boolean[] chr=new boolean[26];
		for(int i=0;i<s.length();i++) {
			char c1=s.charAt(i);
			if(chr[Character.getNumericValue(c1)-10]) return  false;
			chr[Character.getNumericValue(c1)-10]=true;
		}
		return true;
	}

	public static void main(String[] args) {
	    String s="abcdefzer";
	    //System.out.println(" "+isUniqueChars(s));
	    System.out.println(Integer.MAX_VALUE);
		 

	}

}
