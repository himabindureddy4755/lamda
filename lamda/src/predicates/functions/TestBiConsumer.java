package predicates.functions;

import java.util.*;
import java.util.function.BiConsumer;

public class TestBiConsumer {
	
		public static void mian(String[] args)
		{
			ArrayList<JavaStudent> javaStudents =StudentTest.populateStudents();
			BiConsumer<JavaStudent , Integer> bic = (j,i) -> j.marks+=100;
			for(JavaStudent j :javaStudents)
			{
				bic.accept(j, 100);
				System.out.println(j.rollno+"\t"+j.marks);
			}
			
			
		}

	}



