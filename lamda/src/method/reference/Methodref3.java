package method.reference;

public class Methodref3 {
	public static void main(String[] args)
	{
	    Myinter re = Methodref3::student;
		Myinter.student(442,"himani");
		
	}
	public static void student(int rollno, String name)
	{
		System.out.println("Roll name" +rollno +"name" +name);
	}

}
