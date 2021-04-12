package stream.api;


import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class playmap {
	public static void main(String[] args)
	{
		ArrayList<Integer>marks = new ArrayList<Integer>();
		marks.add(45);
		marks.add(70);
		System.out.println(marks);
		List<Integer> updateMarks = marks.stream().map(i ->i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
		List<Integer> evenNumbers = marks.stream().filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
