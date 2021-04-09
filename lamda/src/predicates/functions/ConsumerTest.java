package predicates.functions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {
		static ArrayList<JavaStudent> javaStudents = StudentTest.populateStudents();
		public static void main(String[] args)
		{
			Consumer<JavaStudent> c =s->System.out.println(s.rollno);
			for(JavaStudent student:javaStudents)
			{
				c.accept(student);
			}
		}
}

