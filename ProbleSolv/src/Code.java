import java.util.*; 
/*
Given a number N. our task is to find the closest Palindrome 
number whose absolute difference with given number is minimum.
*/
public class Code{
	static ArrayList<Integer> listt(int n){
		ArrayList<Integer> list=new ArrayList<Integer>();
		String s,h;
		h=""; 
		s=""+n; 
		for(int i=0;i<s.length();i++) {h=h+s.charAt(s.length()-1-i);
		
		}
		// System.out.println("HHH ==== "+h);
		list.add(Integer.parseInt(s)); list.add(Integer.parseInt(h));
		return list;
		
	}
	

	static int fct(int n) {
		ArrayList<Integer> mp=new ArrayList<>();
		int diff=listt(n).get(0)-listt(n).get(1);
	while(diff!=0) {
		n--; 
		mp.clear();
	    mp=listt(n);
		diff=mp.get(0)-mp.get(1);
	}
	return n;
	
	} 
	
	
	
   public static void main(String[] args) {
                      Scanner sc=new Scanner(System.in); 
                      String s;
                      int T=sc.nextInt(); 
                      for(int i=0;i<T;i++){
                    	  int N=sc.nextInt(); 
                    	  s=""+N; 
              if(s.length()==1){System.out.println(""+s); }
              else {	System.out.println(fct(N)); }
}


    }


}