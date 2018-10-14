import java.util.*; 

public class Problm1 {
	 static int N ;
	 ArrayList<Integer> list=new ArrayList<Integer>(); 
	  ArrayList<Integer> list2=new ArrayList<Integer>(); 

       void Entre() {
    	   int k ;   int p ; 
    Scanner sc = new Scanner(System.in); 
    	   System.out.println("N = ");
    	   N=sc.nextInt(); 
    	  
    	   for(int i=0; i<N;i++) {System.out.println("arry["+i+"] = "); 
    	   
    	   list.add(sc.nextInt());             list2=list;   Collections.sort(list2); 
    	   if(i==0) { System.out.println( list.get(i)+" goes to stream --> median "+list.get(i)); }
    	   else {
    		   if((i+1)%2==1) {   System.out.println( list.get(i)+" goes to stream --> median "+list2.get((i+1)/2)); } 
    	  if((i+1)%2==0) {  p =(list2.get(i/2)+list2.get(i/2 +1))/2; 
    	    	             System.out.println( list.get(i)+" goes to stream --> median "+p);      }}}
    	   
    	
    	   
       }
    /*   void mediane() {
    	   int p ;
    	 
    	   
   for(int i=0; i<N ;i++) {  for(int c=0;c<=i;c++) {list2.add(list.get(c));  }
   Collections.sort(list2);
   if(i==0) { System.out.println( list.get(i)+" goes to stream --> median "+list.get(i)); }
   else {
	   if((i+1)%2==1) {   System.out.println( list.get(i)+" goes to stream --> median "+list2.get((i+1)/2)); } 
  if((i+1)%2==0) {  p =(list2.get(i/2)+list2.get(i/2 +1))/2; 
    	             System.out.println( list.get(i)+" goes to stream --> median "+p);      }}
} }*/
	
	public static void main(String[] args) { 
		Problm1 mp=new Problm1(); 
	 mp.Entre();
	

		
	}

}
