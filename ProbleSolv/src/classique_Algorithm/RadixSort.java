package classique_Algorithm;

import java.util.ArrayList;

public class RadixSort {
	
	
	
//	public static int[] redexSorting(int[]arr) {
		
		
	//}

	static int[] classification(int[]arr) {
		//for simplicity i will suppose that i have 3-major classes of numbers,Units of tens and hundreds 
		ArrayList<Integer> unites=new ArrayList<>();
		ArrayList<Integer> tens=new ArrayList<>();
		ArrayList<Integer> hundreds=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {String s=""+arr[i]; 
		if(s.length()==1) {unites.add(arr[i]);  } 
		if(s.length()==2) {tens.add(arr[i]);  }
		if(s.length()==3) {hundreds.add(arr[i]);  } 
		}
		
		int[]brr=new int[arr.length];
		int index=0;
		
		 
			for(int x:unites)
			   {brr[index]=x; index++; }
			for(int x:tens)
			   {brr[index]=x; index++; }
			for(int x:hundreds)
			   {brr[index]=x; index++; }
		 
		return brr;
	}
	
	static int[] clustering(int[]arr) {
		int[] brr=new int[10];
		for(int i=0;i<arr.length;i++) {
			brr[arr[i]]++;
		}
		int[]crr=new int[arr.length];
		int index=0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<brr[i];j++) {
				crr[index]=i; index++;
			}
		}
		return crr;
	}
	

	public static void main(String[] args) {
        int[] arr= {1,2,1,1,7,0,4,4,9,0};
        int[] brr=clustering(arr);
        for(int y:brr)
        	System.out.print(" "+y);
        ArrayList<Integer>ss=new ArrayList<>();
        //System.out.println(ss.at);
        

	}

}
