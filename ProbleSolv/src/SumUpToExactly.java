
public class SumUpToExactly {
	
	static int sumUp(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {n=n+Integer.parseInt(""+s.charAt(i));  }
		return 10-n;
	}
	

	public static void main(String[] args) {
		int n=8;
		System.out.println(n+""+sumUp(""+n));
		 

	}

}
