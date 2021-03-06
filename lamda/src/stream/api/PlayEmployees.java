package stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayEmployees {
	public static void main(String[] args)
	{
		ArrayList<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee("himani",30000));
			empList.add(new Employee("chandu",35000));
			empList.add(new Employee("harshi",24000));
			empList.add(new Employee("divya",28000));
				System.out.println(empList);
				//List<Employee> sortedList = empList.stream().sorted().collect(Collectors.toList());
				//System.out.println(sortedList);
				Comparator<Employee> c=(e1,e2) ->
				{
					return (e1.salary < e2.salary)? -1:
						(e1.salary > e2.salary)? +1: 0;
				};
				//List<Employee> sortedList = empList.stream().sorted(c).collect(Collectors.toList());
				Employee minSalary = empList.stream().min((e1,e2) ->e2.compareTo(e1)).get();
				System.out.println(minSalary.toString());
				
		
	}

}
