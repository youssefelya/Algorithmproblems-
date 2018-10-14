import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.LinkedTransferQueue;
public class MedianPrblm {
	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>(); 
		//HashSet<Integer> list = new HashSet<Integer>();
		//LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt(); 
		int n,d;
		for(int o=0;o<k;o++) { 
			n=sc.nextInt(); d=sc.nextInt(); 
			  for(int i=0;i<=n;i++) {
				  if((i % 10)==d){list.add(i); }
				   if(i/1000 % 10==d) {list.add(i); }
				   if(i/100 % 10==d) {list.add(i); }
		  	       if( (i/10 % 10)==d){list.add(i); }           }
			  Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()) {
				System.out.print(" "+itr.next()); } 
			System.out.println();
			list.removeAll(list);
			 
			}

}
}