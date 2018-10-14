
public class MultiplThreeIn {

	public static void main(String[] args) {
		int max1,max2,max3;
		int[]arr= {100000,2,4,7,4,3,8,5,34,67,100,12,32,99};
		for(int i=0;i<14;i++) {arr[i]=i; }
		max1=arr[0];
		max2=arr[1];
		max3=arr[2];
		
		for(int i=0;i<arr.length;i++) {
	 if(arr[i]>max1) { max3=max1; continue; }
	 if(arr[i]>max2) {max2=arr[i]; continue; }
	 if(arr[i]>max3) {max3=arr[i]; }
	 
			}
		System.out.println(max1+" "+max2+" "+max3);

	}

}
