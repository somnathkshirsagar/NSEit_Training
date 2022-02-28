package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Stud {
	String name;
	int marks;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Stud(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}

public class MarksExaample {
	public static void main(String[] args) {
		
		
		Stud s1 =new Stud("Hrithik",90);
		Stud s2 =new Stud("Swapnil",80);
		Stud s3 =new Stud("Shubham",50);
		Stud s4 =new Stud("Sid",45);
		
		ArrayList<Stud> ar = new ArrayList();
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println(ar);
		
		
		Stream str = ar.stream();
		
		Predicate<Integer> p = x->x>=80;
		
		 List<Integer> data2= (List<Integer>) str.filter(p).collect(Collectors.toList());
	}

}
