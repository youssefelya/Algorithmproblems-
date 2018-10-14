import java.util.*;

public class IsOneEditeOfOther {

	static boolean isPEditeOfOther(String s,String g ) {
		int count=0; 
		HashSet<Character> tbl=new HashSet<Character>();
		for(char c:s.toCharArray() ) {
		tbl.add(c);} 
		for(char c:g.toCharArray()){if(!tbl.contains(c)){ count++;  }  }
		return count<=1;  }
	
	public static void main(String[] args) {
		String x,y;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("x ==  ");
		x=sc.nextLine();
		System.out.println("y ==  ");
		y=sc.nextLine();
		System.out.println( isPEditeOfOther(x,y));}
		
		

	}

}
