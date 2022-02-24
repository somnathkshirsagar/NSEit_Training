package Day2;

public class TestStaticExp {

	public static void main(String[] args) {
	  
		StaticExp s1=new StaticExp();
		StaticExp s2=new StaticExp(20,"Shubham","CSE");
		StaticExp s3=new StaticExp("Swapnil",30,"ENTC");
		
		s1.getDetails();
		s1.getDetails(10);
		s1.getDetails("abc");
	}

}
