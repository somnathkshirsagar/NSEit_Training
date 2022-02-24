package AssignmentDay3;
import java.util.Scanner;
import java.util.function.*;

 class String1{
	 String str;

	public String1(String str) {
		super();
		this.str = str;
	}	 
	 }

public class FunctionInterface {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		String1 s1=new String1(name);
	
		
		Function<String1,String> f1 = str -> {
			String answer= "NotFound";
			for (int i = 0; i < s1.str.length(); i++) {
				if(s1.str.charAt(i) == 'K') {
					return s1.str;
				}				
			}
			return answer;
		};
		
		System.out.println(f1.apply(s1));	
	}

}
