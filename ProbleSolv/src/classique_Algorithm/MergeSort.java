package classique_Algorithm;

public class MergeSort {
	
	//recursive 
	static public int[] sortTwoElementArr(int[]arr) {
		if(arr[0]>=arr[1]) {return arr;}
		else {int temp=arr[0]; arr[0]=arr[1]; arr[1]=temp;
		return arr;}
	}
	//merge two sorted array  
	static public int[] merge(int[]arr,int[]brr) {
		int[]crr=new int[arr.length+brr.length];
		int ia=0,ib=0;
		int x=arr[0],y=brr[0];
		
		while(ia+ib<crr.length) {
			if(ia<arr.length) { x=arr[ia];}
			if(ib<brr.length) { y=brr[ib];}
			if(ib<brr.length&&(x>y||(ia==arr.length))) { crr[ia+ib]=brr[ib]; ib++; }
			else  if((ia<arr.length)&&(x<=y||(ib==brr.length))) {crr[ia+ib]=arr[ia]; ia++;  }
		}
		return crr;
	}
	
 
	static public int[] mergeSorte(int[]arr,int firstIndex,int lastIndex) {
		if(lastIndex<=firstIndex) {return arr;}
		if(arr.length<=0) {return arr;}
		if(arr.length==2) { return sortTwoElementArr(arr); }
		int[]br1=mergeSorte(arr, firstIndex, lastIndex/2);
		int[] br2=mergeSorte(arr, lastIndex/2, lastIndex);
		int[]cr;
		return mergeSorte(arr, firstIndex, lastIndex/2) ;
	}

	
	public static void main(String[] args) {
		int[] arr= {1,4,5,8,99};
		int[]brr= {2,3,5,9,10,22,23};
		int[] kkr=merge(arr, brr);
		for(int g:kkr)
		System.out.print(g+" ");
		 

	}

}
