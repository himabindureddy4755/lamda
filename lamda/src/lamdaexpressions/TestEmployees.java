package lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {
	public static void main(String[] args)
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("himani",442));
		employees.add(new Employee("chandu",415));
		employees.add(new Employee("div",425));
		employees.add(new Employee("harsh",439));
		System.out.println(employees);
		//Comparator<Employee> c =(e1, e2) -> (e1.eid < e2.eid)?-1:(e1.eid > e2.eid)?1:0;
		Comparator<Employee> n =(e1, e2)-> (e1.name.compareTo(e2.name));
		Collections.sort(employees,n);
		//Collections.sort(employees,c);
		System.out.println(employees);
	}

}
