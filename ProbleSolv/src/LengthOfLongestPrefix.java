import java.util.ArrayList;
import java.util.Scanner;

/* 
The length of the longest common prefix of two strings s=s1s2…sn and t=t1t2…tm is defined as the maximum k≤min(n,m) 
such that s1s2…sk equals t1t2…tk. Let's denote the longest common prefix of two strings s and t as lcp(s,t).
Z-function of a string s1s2…sn is a sequence of integers z1,z2,…,zn, where zi=lcp(s1s2…sn,  sisi+1…sn). 
Ж-function of a string s is defined as z1+z2+…+zn.
You're given a string s=s1s2…sn and q queries. Each query is described by two integers li and ri,
 where 1≤li≤ri≤n. The answer for the query is defined as Ж-function of the string slisli+1…sri.
Input ######################################################################################
The first line contains the string s, consisting of lowercase English letters (1≤|s|≤200000).
 The second line contains one integer q — the number of queries (1≤q≤200000). 
 Each of the following q lines contains two integers li and ri, describing the query (1≤li≤ri≤|s|).
*/


public class LengthOfLongestPrefix {
 public static int lcp(String s,String h) {
	 if(s.length()==0) {return 0;}
	 if(h.length()==0) {return 0;}
	 if(s.charAt(0)==h.charAt(0)){return 1+lcp(s.substring(1,s.length()),h.substring(1,h.length())) ;}
	 return 0; }
 
 public static int fct(String s,int l,int r) {
	 int sum=0;
    int n=s.substring(l-1, r).length();
	 for(int i=0;i<n;i++) {
		 sum+=lcp(s.substring(l-1, r),s.substring(l-1, r).substring(i));
	 }
	 
	 return sum;
	 
 }
 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		String s=sc.nextLine();
		int q=Integer.parseInt(sc.nextLine());
		for(int i=0;i<2*q-1;i=i+2) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			list.add(fct(s,l,r)); 	}
	
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		/*String g="bbaaa";
		String h=g.substring(1,3);
		System.out.println(" g == "+g+" h == "+h+" Lengh of g =="+g.length());
		System.out.println(" lcp  == "+lcp(g,h));
		System.out.println("fct  == "+fct(g,1,2));*/
		 
	}

}
