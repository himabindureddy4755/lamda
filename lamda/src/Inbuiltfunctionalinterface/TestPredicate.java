package Inbuiltfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

import Lamdaexpressionsanonymous.Employee;

public class TestPredicate {
	public static ArrayList<Employee> employees;
	public static void main(String[] args)
	{
		//Predicate<Integer> p = i ->i%2 ==0;
		//System.out.println(p.test(13));
		populateEmployees();
		Predicate<Employee> p1 = (e)-> e.salary>=10000;
		for(Employee e:employees)
		{
			if(p1.test(e))
				
			{
				System.out.println(e.name);
			}
		}
		}

	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("himani",20000));
		employees.add(new Employee("bindu",30000));
		employees.add(new Employee("harshi",5000));
		employees.add(new Employee("div",2000));
		// TODO Auto-generated method stub
		
	}

}
