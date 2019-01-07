import java.util.Scanner;

/*
 * Given an array A of N positive integers. The task is to find the longest Zig-Zag subsequence problem such that 
 * all elements of this are alternating (Ai-1 < Ai > Ai+1).
Input:
The first line of input contains an integer T denoting the number of test cases.
 Each test case contains an integer N which denotes the number of elements in the array A.
  Next line contains space separated n elements in the array A.​
Output:
Print the length of the longest such subsequence.
Constraints:
Example:
Input:
1
6
5 5 10 100 10 5
Output:
3
 */


public class LongestZigZagSubSequence {
	static public int count=0;
	static public int check(int[] arr,int i,int n) {
		if(arr.length==1) {return 0; }
		if(n<=i) {return 0; }
		//if(arr.length==3){if(arr[0]<arr[1]&&arr[1]>arr[2]) {return 2; } else return 1;   }
		 if(arr[i]<arr[arr.length/2]&&arr[n]<arr[arr.length/2]){return 2+check(arr ,++i,--n);   }
		 return Math.max( check(arr ,i,--n), +check(arr ,++i,n));
		 }

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int N=sc.nextInt();
			int[] arr =new int[N];
			for(int j=0;j<N;j++) { arr[j]=sc.nextInt();   }
			int in=0,n=arr.length-1;
		System.out.println(check(arr,in,n)); 
		
		}

	}

}
