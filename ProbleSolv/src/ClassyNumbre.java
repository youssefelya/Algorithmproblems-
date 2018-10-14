import java.util.*;

public class ClassyNumbre {
	
	static boolean isClassy(int n) {
		String s=""+n;
		int count =0;
		for(int i=s.length()-1;i>0;i--) { if(s.charAt(i)!='0') {count++;}  }
  return count<3; 	}
	

	static int IsClassyNumbre(String a,String b) {
		if(b.length()<=3) {return Integer.parseInt(b)-Integer.parseInt(a)+1;   } 
		int count=0;
		for(int i=Integer.parseInt(a);i<=Integer.parseInt(b);i++) {
			if(isClassy(i)) {count++;}
		}
		return count; 
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("a == "); a=sc.nextInt(); 
		System.out.println("b == "); b=sc.nextInt(); 
		System.out.println(IsClassyNumbre(""+a,""+b));
		
		 

	}

 

}
