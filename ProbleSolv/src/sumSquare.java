/*
  Given a positive integer n, find the smallest number of squared integers which sum to n.
For example, given n = 13, return 2 since 13 = 32 + 22 = 9 + 4.
Given n = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.
*/
public class sumSquare {
	
	static public int generator(int i) {
		return i*i;
	}

	static public int NumberOfsquared(int n) {
		int sum=0;
		int count=0;
		for(int i=0;i<n*n;i++) {
			if(n==sum) {
				sum=sum+generator(i);
			} 	if(sum>n){  }
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,5,2,6,4,2,8,0,98,8,-6 };
		
		 

	}

}
