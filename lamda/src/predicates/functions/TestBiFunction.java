package predicates.functions;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

import Lamdaexpressionsanonymous.Employee;

public class TestBiFunction {
	public void main(String[] args)
	{
		BiFunction<Integer,Integer,Student> bif = (i,s) -> new Student(s,i);
		Student student = bif.apply(17,70);
		
		
		
		
	
		
		
		
		
		}

}
	

