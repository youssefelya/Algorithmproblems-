import java.util.*;

public class MaximumIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int testcase=sc.nextInt(); 
		
		for(int y=0;y<testcase;y++) {
			int n=sc.nextInt();
			int[] A=new int[n]; 
			for(int i=0;i<n;i++){ A[i]=sc.nextInt();   }
			int max=0; int g=0; int f=n-1; 
			while(g<n) {  
				if(A[g]<=A[f]) {if(f-g>max) {max=f-g; g=f ;}  }
				else{g=g+1; if(g==f) { f--; }     }
			}
			System.out.println(max);
			}

	}

}
