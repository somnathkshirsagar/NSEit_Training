package Day5;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new LinkedHashSet();
		hs.add("India");
		hs.add("Japan");
		hs.add("China");
		hs.add("Nepal");
		System.out.println("Elements of LinkedHashSet");
		System.out.println(hs);
		hs.add("India");

		Set<String> hs1 = new HashSet();
		hs1.add("Hi");
		hs1.add("Hello");
		hs1.add("Bye");
		hs1.add("GoodBye");
		System.out.println("Elements of HashSet");
		System.out.println(hs1);
		hs1.add("India");
		//
		Set<String> hs2 = new TreeSet();
		hs2.add("English");
		hs2.add("Marathi");
		hs2.add("Hindi");
		hs2.add("Kannada");
		System.out.println("Elements of TreeSet");
		System.out.println(hs2);
		hs.add("Telugu");

		 }


}
