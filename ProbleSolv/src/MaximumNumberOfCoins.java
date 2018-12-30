import java.util.*; 
public class MaximumNumberOfCoins{

   public static  int ColonCount(int[][]m,int i,int j){
        if(i==m.length-1){return m[i][j];  }
        else{
            int sum=0; for(int h=i;h<m.length;h++){sum=sum+m[h][j]; }
            return sum;
         }
     }
  public static   int LineCount(int[][]m,int i,int j){
        if(j==m[0].length-1){return m[i][j];  }
        else{
            int sum=0; for(int h=j;h<m.length;h++){sum=sum+m[i][h]; }
            return sum;
         }
     }

public static ArrayList<Integer> fct(int[][] m){ 
    ArrayList<Integer> list=new ArrayList<>(); 
    int i=0,j=0;
    int n=m.length; 
    while(i+j<2*(n-1)){ 
        if(ColonCount(m,i,j)>LineCount(m,i,j)){ list.add(i); list.add(j); i++;   }
        if(ColonCount(m,i,j)<=LineCount(m,i,j)){ list.add(i); list.add(j); j++;   }
  }
  return list; 
}

    


    public static void main(String[] args) {
        System.out.println("Hello from Visual code");
        System.out.println("Matrix M == "); 
        Scanner sc=new Scanner(System.in);
        int[][]m=new int[3][3];
     for(int i=0;i<3;i++){for(int j=0;j<3;j++){m[i][j]=sc.nextInt(); } }
     System.out.println(fct(m));

       
    }
}