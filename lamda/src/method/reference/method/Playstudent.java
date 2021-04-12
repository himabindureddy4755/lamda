package method.reference.method;

public class Playstudent {
	public static void main(String[] args)
	{
		IStudent is = Student::new;
		Student s = is.get("himani",21,442,100);
	}

}
