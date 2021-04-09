package predicates.functions;

import java.util.function.Function;

public class TestFunctionalIF {
	public static void main(String[] args)
	{
		Function<Integer,Integer> f =i -> i*i;
		System.out.println("square of 5 is " +f.apply(5));

		Function<String,Integer> f1 =s -> s.length();
		System.out.println("length of himanireddy is " +f1.apply("himanireddy"));
	}

}
