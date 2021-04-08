package lamdaexpressions;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.eid < e2.eid) return -1;
		else if(e1.eid > e2.eid) return 1;
		else return 0;
		
	}
	

}
