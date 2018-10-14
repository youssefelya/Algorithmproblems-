import java.util.*;

public class OutOfOrder {
	
	static int outOfOrders(int[] arr,int init,int fin,int[][]b ) {
		
		if(arr.length<=1||init>=fin) return 0;
		if(b[init][fin]!=0) {return b[init][fin];}
		if(arr[fin]<=arr[init]){
			b[init][fin]= 1+outOfOrders(arr,init++,fin,b)+outOfOrders(arr,init,fin--,b) ; 
		return  1+outOfOrders(arr,init++,fin,b)+outOfOrders(arr,init,fin--,b);
	 
		}
		else 
			b[init][fin]= outOfOrders(arr,init++,fin,b)+outOfOrders(arr,init,fin--,b);
		return  outOfOrders(arr,init++,fin,b)+outOfOrders(arr,init,fin--,b);
	 
	 
		}
 
		
	
	

	public static void main(String[] args) {
 
		int[] arr=new int[5];
		
		for(int i=0;i<4;i++)arr[i]=i;
		int[][] b =new int[arr.length][arr.length];
		int i=0;int n=arr.length-1;
		//for(int g:b)
		//System.out.print( g+" ");
		System.out.println(outOfOrders(arr,i,n,b));
		
		 

	}

}
