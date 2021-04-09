package predicates.functions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
		static ArrayList<JavaStudent> javaStudents = StudentTest.populateStudents();
		public static void main(String[] args)
		{
			Predicate<JavaStudent >p =s ->s.marks>=60;
			Consumer<JavaStudent> c =s->System.out.println(s.rollno);
			System.out.println("students who have got 60 and above");
			for(JavaStudent student:javaStudents)
			{
				if(p.test(student)) {
				c.accept(student);
			}
		}
}
}


