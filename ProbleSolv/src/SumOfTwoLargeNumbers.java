import java.math.BigInteger;
import java.util.Scanner;

/*
 * Given two non-negative numbers X and Y.
 *  The task is calculate the sum of X and Y. 
 *  If the number of digits in sum (X+Y) are equal to the number of digits in X,
 *   then print sum, else print X.
*/

public class SumOfTwoLargeNumbers {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 BigInteger X=new BigInteger("1"); 
		 BigInteger Y=new BigInteger("1"); 
		 BigInteger sum=new BigInteger("1"); 
		 int T=sc.nextInt();
		 String s="",h="";
		 for(int i=0;i<T;i++) {
			 X=sc.nextBigInteger();
			 s=""+X; 
			 Y=sc.nextBigInteger();
			 sum=X.add(Y); h=""+sum; 
			 if(s.length()==h.length()) {System.out.println(sum);}
			 else {System.out.println(X); }
			  }

	}

}
