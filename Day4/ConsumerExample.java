package Day4;
import java.util.function.*;

class Emp {
    
	
	 String name;
	 String desgn;
	 int sal;
	 
	
	public Emp(String name,String desgn, int sal) {
		this.sal=sal;
		this.name=name;
		this.desgn=desgn;
	}
	
	public void printDetails() {
		System.out.println("Name : "+name+"Desgn : "+desgn+" salary : "+sal);
	}
    
	} 

public class ConsumerExample {
	
    public static void main(String[] args) {
	
    	
    	  Consumer<Emp> con = e->{
    		  System.out.println("Name: "+e.name);
    		   System.out.println("Desgination: "+e.desgn);
    		System.out.println("Salary: "+e.sal);
    		};
    		Emp emp1 = new Emp("Hrithik","Manager", 50000);
    		Emp emp2 = new Emp("Swapnil","Clerk", 50000);
    		con.accept(emp1);
    		con.accept(emp2);
}


 

}


