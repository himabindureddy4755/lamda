package stream.api;

public class Employee {
	String name;
	int salary;
	public char[] toString;
	public Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	
	{
		return this.name+"\t"+this.salary;
		
	}
	public int compareTo(Employee o)
	
	{
		return (this.salary>o.salary)?1:
			(this.salary<o.salary)?-1:
				0;
		
	}
}
