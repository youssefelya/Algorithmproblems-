import java.util.Scanner;

public class MatrixSlockwiseSpiral {
	 
	
	static void printLigneF(int[][]m , int b,int e,int colm) {
		 
		for(int i=b;i<=e;i++) {System.out.print(m[colm][i]);} 
		
	}
static	void printLigneS(int[][]m , int b,int e,int colm) {
		 
		for(int i=e;i>=b;i--) {System.out.print(m[colm][i]);} }

	static void printColmF(int[][]m , int b,int e,int ligne) {
		 
		for(int i=b;i<=e;i++) {System.out.print(m[i][ligne]);} }
	
	static void printColmS(int[][]m , int b,int e,int ligne) {
		 
		for(int i=e;i>=b;i--) {System.out.print(m[i][ligne]);} }
	
	static void PrintMatrix(int[][]m ) {
		 for(int i=0;i<m.length-1;i++) {
			 printLigneF(m,i,m.length-1 -i,i);
			 printColmF(m, i+1 ,m[0].length-1-i,m.length-1-i);
			 printLigneS(m,i,m.length-1-i-1,m[0].length-1-i); 
			 printColmS(m, i+1 ,m[0].length-1-i, i);  }	 	}
			
	public static void main(String[] args) {
		int n=5;
		int m=5;
		int[][] matrix =new int[n][m] ; 
		for(int i=0;i<n;i++) {for(int j=0;j<m;j++)
			 matrix[i][j]=i+j;}
		for(int i=0;i<5;i++) {matrix[0][i]=matrix[0][i]*3; } for(int i=0;i<5;i++) {matrix[2][i]=matrix[0][i]*5; }
		for(int i=0;i<5;i++) {matrix[1][i]=matrix[0][i]*2; }
		System.out.println(matrix.length+"\t "+matrix[0].length);
  for(int j=0;j<m;j++) {System.out.println(); for(int i=0;i<m;i++) {System.out.print(" "+matrix[j][i]);}}
  System.out.println("\n With fonction"); 
    PrintMatrix(matrix);

	}

}
