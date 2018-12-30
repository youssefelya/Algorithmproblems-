import java.awt.*;
import java.util.ArrayList;

/*
 * Given a list of float numbers, insert '+' '-', '*' '/'
 * between each consective pair of numbers to find the maximum value
 * you can get. 
 * For simplicity assum that all operators are equal 
 * precedence order and evalution happens from left to right. 
 * exemple 
 * [1,12,3] -> 1+12*3=39
 * 
 *  My solution is that i will write function that separet negative and pisitif numbers 
 * if number is >1 then i will use multiplication 
 * if 0< and <1  i will use / 
 * if it's ==0 i will use + 
 * i will multiplay all smulest numbers if i had one left o will use - 
 */
public class GoolInterview {
	
	static public float maxfour(float mult,float sum,float diff1 ,float diff2,float div1,float div2 ) {
		float p1=Math.max(mult, sum); 	float p2=Math.max(diff1, diff2);
		float p3=Math.max(div1, div2);
		float p4=Math.max(p1, p2); float p5=Math.max(p3, p4);
		return p5; 	}
	
	
	static public float maxflo(float array0,float array1) {
		float div1=0;
		float div2=0;
		float mult=array0*array1;
		float sum=array0+array1;
		float diff1=array0-array1;
		float diff2=array1-array0;
	if(array1!=0) { div1=array0/array1; }
	if(array0!=0) { div2=array1/array0; }
		return maxfour(mult,sum,diff1,diff2,div1,div2); 	}
	
	static public float Max_value(float[]arr ){
		float Max=0;
		if(arr.length==1) {return arr[0];}
		Max=maxflo(arr[0],arr[1]);
		if(arr.length>2) {
		for(int i=2;i<arr.length;i++) {
		Max=maxflo(arr[i],Max); }    }
     	return Max;
	}
	
	

	public static void main(String[] args) {
	float[] arr= {1,1,-1,0,0,0};
	System.out.println(Max_value(arr));
	   
	}

}
