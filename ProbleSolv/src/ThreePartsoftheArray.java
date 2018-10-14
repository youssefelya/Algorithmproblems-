import java.io.*;
import java.math.*;
import java.util.*;

public class ThreePartsoftheArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int n=sc.nextInt();
	int n=sc.nextInt(); 
	int f;
	BigInteger [] Arry = new BigInteger[n];
    /*Input     */
    for(int i=0;i<n;i++) {
    	f=sc.nextInt();
    	Arry[i]= BigInteger.valueOf(f);  }
    
    BigInteger x,y;
   int i=0; int j=n-1;
   BigInteger max= BigInteger.valueOf(0);
   
    x=Arry[0]; 
    y=Arry[n-1];
    while(i<j) {
    	if(x.equals(y)) { i++;  max=x; x=x.add(Arry[i]);  }  
    	if(x.compareTo(y)<0) { i++; x=x.add(Arry[i]);           }
    	if(y.compareTo(x)<0) {  j--;  y=y.add(Arry[j]);  } }
    System.out.println(max);

}
}
