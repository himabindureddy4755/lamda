package predicates.functions;

import java.util.function.BiFunction;


import Lamdaexpressionsanonymous.Employee;

public class TestBiFunction {
	public void main(String[] args)
	{
		BiFunction<Integer,String,Employee> bif = (i,s) -> new Employee(s,i);
		Employee employee = bif.apply(442,"himani");
		System.out.println(employee.name);
	}

}
