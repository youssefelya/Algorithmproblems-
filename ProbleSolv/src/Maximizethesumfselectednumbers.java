import java.util.*;

public class Maximizethesumfselectednumbers {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int testcase=sc.nextInt();
	 for(int i=0;i<testcase;i++) {
		 int n=sc.nextInt();
		 int[] A=new int[n];
		 int m=sc.nextInt();
		 int[] B=new int[m];
		 for(int j=0;j<n;j++) {A[i]=sc.nextInt(); }
		 for(int j=0;j<m;j++) {B[i]=sc.nextInt(); }
		 System.out.println("############# X =  ################");
		 int x=sc.nextInt();
		 int v=Math.abs(x-(A[0]+B[0]));
		int p1 = 0,p2 = 0;
		 for(int p=0;p<n;p++) {for(int q=0;q<m;q++) {if(v>Math.abs(x-(A[p]+B[q]))) {v=Math.abs(x-(A[p]+B[q])); p1=p;p2=q; }    }  }
		 System.out.println("Somme plus proche c'est "+A[p1]+" et  "+B[p2]);
		 
			 
	 }
	}

}
