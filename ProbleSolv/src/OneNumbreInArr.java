import java.util.*;

public class OneNumbreInArr {

	static ArrayList<Integer>  findOnenumbre(int[] arr) {
		HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
		int d=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		int j=1;
		for(int c:arr){if(set.containsKey(c)){ set.put(c,set.get(c)+1);   } else{set.put(c,j);  }     }
		System.out.println("value wish key is  2 == "+set.get(2));
		System.out.println(set);
		for(int c:arr) { if(set.get(c)==1) {list.add(c); }  }
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
	
		int[] arr=new int[10];
		for(int i=6;i<10;i++) {arr[i]=i; }
		for(int i=0;i<=5;i++) {arr[i]=i; }
		int n=3000000;
		System.out.println(findOnenumbre(arr)+"n  ===  "+n); 
		

	}

}
