import java.util.*;

public class XTotalShapes {
	
	public void ConnectArea(int[][] matrx) {
	for(int i=0;i<matrx.length;i++) {for(int j=0;j<matrx.length;j++) {if(matrx[i][j]==0) {      }  }  }	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		ArrayList<String> list = new ArrayList<String>();
		
		//int testcase=sc.nextInt();
		int n=sc.nextInt();; 
		//for(int o=0;o<testcase;o++) {
		int[][] l = new int[n][n];
			for(int i=0;i<n;i++) {for(int j=0;j<n;j++) {l[i][j]=1;   }  }
			
			for(int i=0;i<n;i++) {for(int j=0;j<n;j++) { if(sc.next().charAt(0)=='X') { l[i][j]=0;    }   }  }
			for(int i=0;i<n;i++) {for(int j=0;j<n;j++) {      System.out.print(" "+l[i][j]); }System.out.println();}
			
		//}
		

	}

}
