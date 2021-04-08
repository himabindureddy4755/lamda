package lamdaexpressions;
import java.util.function.Function;

public class Lmda {
	public static void main(String[] args) {
		Isum is = (a, b) -> a+b;
		System.out.println(is.add(10,20));
		FuncInterface fi = () -> System.out.println("hello");
		fi.m1();
		
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
