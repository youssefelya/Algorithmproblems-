import java.util.HashSet;
import java.util.Scanner; 
public class PrintAllpermutation {

	 static String[] paiString(String s) {
		 String[] temp=new String[2];   String g; 
		 char c0=s.charAt(0);  char c1 =s.charAt(1);
		 temp[0]=""+c0+c1 ;  temp[1]=""+c1+c0 ; return temp;  }
	
	static String Stringini(String s,char c, int i) { 
		if(i==s.length()) {return s+""+c;  }
		if(i==0) {return c+""+s;}
		String temp1=s.substring(0, i);
		String temp2=s.substring(i,s.length()); 
		return temp1+""+c+temp2;  }
	 
static void Stringpermutation(String s) {
	int n=0;
	if(s.length()==1) {System.out.println(s); return; }
	else{String p=s.substring(0,2);  String d=s.substring(2,s.length()); 
	fctr( paiString(p)[0],d,n);
	fctr( paiString(p)[1],d,n);  } 	} 

static void fctr(String h,String temp,int index) { 
	if(index==temp.length()) {   System.out.println(h); } 
	else { 	char c =temp.charAt(index); index++;
		for(int i=0;i<=h.length();i++) {fctr(Stringini(h,c,i),temp,index);  }
		}
}

	
	
	public static void main(String[] args) {
		String f,h;
		int n=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("f == "); f=sc.nextLine();
			Stringpermutation(f);  }
		 
	
		 
			
		}
		 

	}

