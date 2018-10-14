import java.util.*;

public class LongestPalindromic {
	static String h="" ;
	static String Max(String s,String p) {
		if(s.length()>=p.length()) {return s; }
		else return p;   	}
	
	static String LongestPilndrom(String s) {
		if(s.length()==1) {return s;}
		if(s.length()==2) {if(s.charAt(0)==s.charAt(1)) {return s;}else {return ""+s.charAt(0);}  }
		
			else {
			char c1=s.charAt(0);
			char c2=s.charAt(s.length()-1);
			if(c1==c2) {
		return c1+LongestPilndrom(s.substring(1,s.length()-1))+c2; } 
			else { return Max(LongestPilndrom(s.substring(0,s.length()-1)),LongestPilndrom(s.substring(1,s.length())));
					}	
		}
	}
	
	static String LongestPilndromdp(String s,int i,int f,String[][]m) {
		if(i==f) {return ""+s.charAt(i);}
		if(i+1==f) {if(s.charAt(i)==s.charAt(f)) {return s;}else {return ""+s.charAt(i);}  }
		if(m[i][f]!=null) {return m[i][f];}
		if(i<f) {
	if(s.charAt(i)==s.charAt(f)) {
		  m[i][f] =s.charAt(i)+LongestPilndromdp(s,++i,--f,m)+s.charAt(f); 
		  return  m[i][f];  }
	else
			m[i][f]= Max(LongestPilndromdp(s,++i,f,m),LongestPilndromdp(s,i,--f,m) ); 
			return m[i][f];} 
		return "";
		
	}

			
	 		
	
		
	
	

	
	 

	public static void main(String[] args) {
		 String s = null,h;
		 String[][]m = null;
		 Scanner sc=new Scanner(System.in);
		 int i=0;
		 int y=10;
		 while(true) {
			 System.out.println("s == ");
			 s=sc.nextLine();
			 int f=s.length()-1;
		 
			 m=new String[2*s.length()][2*s.length()];
			System.out.println(LongestPilndromdp(s,i,f,m));
		
			//System.out.println(s.substring(1,s.length())+"\t"+s.substring(0,s.length()-1));
		 }

	}

}
