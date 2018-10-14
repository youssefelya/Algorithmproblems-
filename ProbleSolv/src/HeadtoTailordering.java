import java.util.*;

public class HeadtoTailordering {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++) {
			int NumbreOfString=sc.nextInt();
			for(int q=0;q<NumbreOfString;q++) { 
			list.add(sc.next().charAt(0) );	
			list.add(sc.next().charAt(sc.next().length()-1));
			}
		}
	
	}

}
