package predicates.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {

	static ArrayList<JavaStudent> javaStudents;
	public static void main(String[] args)
	{
		populateStudents();
		Function<JavaStudent,String> f =(j) ->{
			if(j.marks>80) return "distinction";
			else if(j.marks>60) return "first class";
			return "fail";
				
		};
	
		for(JavaStudent s: javaStudents)
		{
			System.out.println(s.rollno+"\t"+f.apply(s));
		}
		
		
		
	}
	public static ArrayList<JavaStudent> populateStudents() {
		javaStudents = new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent(442,90));
		javaStudents.add(new JavaStudent(439,50));
		javaStudents.add(new JavaStudent(425,60));
		// TODO Auto-generated method stub
		return javaStudents;
		
	}

}
