package predicates;

import java.util.function.Predicate;

import java.util.function.IntPredicate;


public class ChainPredicates {
	public static void main(String[] args) {
		Predicate<Integer> p1 =i->i%3==0;//check for divisible by 3;
		Predicate<Integer> p2 =i->i%4==0;//check for divisible by 4
		
		int[] intArray ={10,15,16,24,48,36,60};
		for (int i :intArray)
		{
			if(p1.and(p2).test(i))
			{
				System.out.println(i);
				System.out.println(":divisible by 12");
				
			}
			else {
				System.out.println(i);
				System.out.println(":not divisible by 12");
			}
		}
		

}
	}
