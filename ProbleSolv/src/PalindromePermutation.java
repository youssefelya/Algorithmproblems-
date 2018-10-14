import java.util.*;

public class PalindromePermutation {
	static void isPermuitation(String s) {
		HashSet<Character> list=new HashSet<Character>();
		ArrayList<Integer> fc=new ArrayList<Integer>();
		int x=0;
		for(int i=0;i<s.length();i++) {
			char f=s.charAt(i);
			if(list.contains(f)) {
				fc.add(1) ;  }
			list.add(f);}
		System.out.println(s.length());
		System.out.println(fc.size());
	
		
		
	}

	public static void main(String[] args) {
		
		String s="aab";
		 isPermuitation(s);

	}

}
