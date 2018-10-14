import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList<Integer>();
		for(int i= 0;i<10;i++) {ls.add(i); }
		System.out.println(ls);
		System.out.println(ls.subList(4, 6));
		ls.removeAll(ls.subList(4, 6));
		
		
		System.out.println(ls);

	}

}
