import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Eclogp1p2 {
	
	
	public static  int  get_lowest_divisor(int a){
		int i = 0;
		for (i = 2; i <=  Math.sqrt(a); ++i)
		{	if (a%i == 0)	{ return i; } }
		
		  return a ; }
	public static   int f(int A,int  B,int  C,int D,int  i) {
		if(i==1) {return 0; }
		else return  A*i*i*i+B*i*i+C*i+D;      }
	static ArrayList<Integer> get_all_divisors(int p){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int x = 0;
		while (p > 1){ x = get_lowest_divisor(p);  arr.add(x); 	p = p / x;  } 
		return arr;  }
	
	static HashMap<Integer,Integer> getValuePow(int n){
		HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		 list=get_all_divisors(n);
		 for(int i=0;i<list.size();i++) {
				if(set.containsKey(list.get(i))) {int x=set.get(list.get(i)); x++;   set.put(list.get(i),x);  }
				else {set.put(list.get(i), 1); } }
	            return set; }
	 
	static int sum(int n,int A,int B,int C,int D) {
		int sum=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		  // Inside the loop for 
		 HashMap<Integer,Integer> set=new HashMap<Integer,Integer>(); 
		 for(int j=1;j<=n;j++){ 
			list=get_all_divisors(j);  
		 set= getValuePow(j);
		 int valeurdansList;
		 int puissance;
		 for(int i=0;i<set.size();i++){
			 valeurdansList =list.get(i);
			 puissance=set.get(list.get(i));
			 sum= sum+ puissance*f(A,B,C,D,list.get(i));   }  }
		 
		return sum;
	}
	
	
	
	
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> set=new HashMap<Integer,Integer>(); 
		Scanner sc= new Scanner(System.in); 
		ArrayList<Integer> mp=new ArrayList<Integer>();
		int n;
		System.out.println("n == ");
		n=sc.nextInt();
		int A=0,B=0,C=1,D=0;
		mp= get_all_divisors(n);
		System.out.print("get all divisor "+mp+"\t get value pow  "+getValuePow(n)+"\t pow por 2 = "+getValuePow(n).get(mp.get(0)));
		System.out.print("\t pow pour 3=  "+getValuePow(n).get(mp.get(1)));
	//	System.out.println(sum(n,A,B,C,D)); 
	 
} 
	}
