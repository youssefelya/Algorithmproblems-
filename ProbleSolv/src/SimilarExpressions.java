/*
  Given two expressions in the form of strings. The task is to compare them and check if they are similar. 
 * Expressions consist of lowercase alphabets, '+', '-' and  '( )'.
Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case contains two lines. And each line contains an expression.
Output
For each test case, print in a new line "YES"  if the expressions are similar else print "NO".
Constraints:
1<=T<=100
3<=|Expression length|<=100
Example:
Input:
2
-(a+b+c)
-a-b-c
a-b-(c-d)
a-b-c-d
Output:
YES
NO
 */

public class SimilarExpressions {
	
	
 static public int sum(String s) {
	 int sum=0,sum1=0;
	 int[] index =new int[s.length()] ;
		int[] array=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {index[i]=1;      continue; }
			if(s.charAt(i)==')') {index[i]=1;      continue; }
			if(s.charAt(i)=='+') {array[i]=0;      continue; }
			if(s.charAt(i)=='-') {array[i]=1;      continue; }
			array[i]=Character.getNumericValue(s.charAt(i));  	}
		for(int j=0;j<s.length();j++) {
		
		for(int i=0;i<s.length();i++) {
			//if(array[i]==-1){ index=i; continue;  }
			if(array[i]==-2){  }
		
			if(array[i]==0) {sum1=sum1+array[i+1]; }
			if(array[i]==1) {sum1=sum1-array[i+1]; } 
			} }
		return sum1;
	} 
	

	static public void fct(String s,String h) { }
		
	
	public static void main(String[] args) {
		 
		 

	}

}
