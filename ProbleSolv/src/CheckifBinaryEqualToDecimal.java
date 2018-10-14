import java.util.*;

public class CheckifBinaryEqualToDecimal {
	
	static double  convert(String s,int base) {
		int n= Integer.parseInt(s); 
		int h;
		int  x=s.length()-1; 
		double value=0;
		for(int i=0;i<s.length();i++) { h=Integer.parseInt(s.substring(i,i+1)); value =value +h*Math.pow(base,x); x--;        }
		return value;
	}
	

	public static void main(String[] args) {
                   String s,y;
                   Scanner sc=new Scanner(System.in);
                while(true) {   System.out.println("b == ");
                   int p=5;
                 //  System.out.println(Math.pow(p, 2));
                 s=sc.nextLine();  
                  System.out.println("bin == "+convert(s,16));}
             
                   
	}

}
