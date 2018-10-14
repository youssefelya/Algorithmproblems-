import java.util.Scanner;

public class PalanidromPermutaionCrok {
	static boolean isPermutationOfPalindrome(String s,String h) {
		String phrase=s+h;
		 int countOdd = 0;
		 int[] table =new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		 for (char c :phrase.toCharArray()) {
		 int x = Character.getNumericValue(c)-Character.getNumericValue('a');
		 if (x != -1) {
		 table[x]++;
		 if (table[x] % 2==1) {
		 countOdd++;
		 } else {  countOdd--; } } } return countOdd<=1;}
	
 public static int fct(String[] arr,int n ) {
	 int count=0;
		for(int i=0;i<n;i++) {for(int j=i+1;j<n;j++){  
			if(isPermutationOfPalindrome(arr[i],arr[j])){count++; }    } } 
 return  count; }

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s;
		int n=sc.nextInt();
		String []arr = new String[n] ; 
		for(int i=0;i<n;i++) {arr[i]=sc.next(); }
		System.out.println(fct(arr,n )); 
		 
		 }

}
