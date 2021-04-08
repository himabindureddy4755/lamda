package lamdaexpressions;

import java.util.function.Function;

public class FirstLamda {
	public static void main(String[] args)
	{
		int sq4 =squareIt(4);
		System.out.println(sq4);
		Function<Integer,Integer> f =n->n*n;
		System.out.println(f.apply(4));
	}

	private static int squareIt(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}
	public static void m1() {
		System.out.println("hello");
		
	}
	public static int add (int a, int b)
	{
		return a+b;
		
	}

}
