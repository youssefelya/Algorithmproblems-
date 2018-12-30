import java.util.*;

//Given a string find the longest palindrome substring
//
public class LongestPalindromic {
	static String h="" ;
	static String Max(String s,String p) {
		if(s.length()>=p.length()) {return s; }
		else return p;   	}
	
	static String LongestPilndrom(String s) {
		if(s.length()==1) {return s;}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			
		if(s.length()==2) {return s;  }
		else {
			char c1=s.charAt(0);
			char c2=s.charAt(s.length()-1);
			return c1+LongestPilndrom(s.substring(1,s.length()-1))+c2; }  }
		
		else { return Max(LongestPilndrom(s.substring(0,s.length()-1)),LongestPilndrom(s.substring(1,s.length())));
					}	
		}
	
	
	static String LongP(String s,int i,int f,String[][]m) {
		if(i==f) {return ""+s.charAt(i);}
		if(i+1==f) {return s;}
		if(m[i][f]!=null) {return m[i][f];  }
		 
	  if(s.charAt(i)==s.charAt(f)) {
	  	  m[i][f] =s.charAt(i)+LongP(s,++i,--f,m)+s.charAt(f); 
		  return  s.charAt(i)+LongP(s,++i,--f,m)+s.charAt(f);
		  }
 
	else  {	      
		  m[i][f]= Max(LongP(s,++i,f,m),LongP(s,i,--f,m) ); 
			return Max(LongP(s,++i,f,m),LongP(s,i,--f,m) ); 
			}  }

	 

			
	 		
	
		
	
	

	
	 

	public static void main(String[] args) {
	 
		 String s = null;
		 Scanner sc=new Scanner(System.in);
		 int i=0;
		 int y=10;
		 while(true) {
			 System.out.println("s == ");
			 s=sc.nextLine();
			 int f=s.length();
			 String[][] m=new String[f+1][f+1];
			// System.out.println("m 0 0 ===  "+m[0][0]);
			System.out.println( LongP(s,i,f-1,m));
		
			//System.out.println(s.substring(1,s.length())+"\t"+s.substring(0,s.length()-1));
		 }

	}

}
