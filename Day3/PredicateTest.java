package Day3;

import java.util.Scanner;
import java.util.function.*;


public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> p1= (n) -> n%2==0;
		
		System.out.println("Even : "+p1.test(10));
		
		Predicate<String> p2 = str -> str.length() >= 5;
		
		System.out.println("Length grater than 5 : "+p2.test("Hrithik"));
		
		Predicate<Integer> p3= (n) -> {
			boolean isPrime=true;
			for (int i = 2; i < n-1; i++) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		};
		
		System.out.println(" Prime : "+p3.test(21));

		 
		Predicate<Integer> p4 = (n) -> n>100;
		
		System.out.println("> 100 : "+p4.test(240));
		
		System.out.println(" > 100 and Even : " +p1.and(p4).test(240));
		System.out.println(" > 100 and Even : " +p1.or(p4).test(24));
		
		System.out.println(" Odd : " +p1.negate().test(7));
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the Useranme");
		int uid=sc.nextInt();
		System.out.println("ENter the Password");
		int pass=sc.nextInt();
		
		//Predicate<User> u= usr -> usr.username("Hrithik") && usr.password.equals("Hrithik");
		
		
	}

}



class User{
	String username;
	String password;
	public User(String username,
	String password){
		this.username=username;
		this.password=password;
	}
}
