package predicates.functions;

import java.util.function.Predicate;
import java.util.function.IntPredicate;
public class TestIntPredicate {
	public static void main(String[] args) {
		IntPredicate p1 = i -> i%3 == 0;//check for divisible by 3
		System.out.println(p1.test(12));
		

	}
}
