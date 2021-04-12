package stream.api;

import java.util.ArrayList;
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
				List<Employee> sortedList = empList.stream().sorted().collect(Collectors.toList());
				System.out.println(sortedList);
		
	}

}
