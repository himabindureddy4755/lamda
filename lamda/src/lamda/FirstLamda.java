package lamda;

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

}
