import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import myobj.Student.Student;

public class D04_Comparator {

	public static void main(String[] args) {
		
		List<String> words=new LinkedList<>();
		
		words.add("airplane");
		words.add("jet");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");
		
		Collections.sort(words);
		System.out.println(words);
		
		List<Student> group=new LinkedList<>();
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		
		Collections.sort(group,new StudentComparatorA());
		Collections.sort(group,new Comparator<student>());
		
			@Override
			public int compare(Studento1,Studento2) {
				return (int)Math.ceil(o1.getAvg()-o2.getAvg());
			}
			System.out.println(group);
	}
}
