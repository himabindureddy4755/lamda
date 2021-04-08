package lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(30);
		a1.add(70);
		a1.add(5);
		a1.add(60);
		a1.add(10);
		a1.add(2);
		a1.add(22);
		a1.add(17);
		System.out.println(a1);
		Comparator<Integer> c =(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(a1,c);
		System.out.println(a1);
		
		
	}

}
