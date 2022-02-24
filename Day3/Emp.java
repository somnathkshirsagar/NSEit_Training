package Day3;

import java.util.Scanner;
import java.util.function.*;

public class Emp {
     
	
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

class EmpFunctionTest{
	
	public static void main(String[] args) {
		Function<Emp,Emp> f =emp -> {
			if(emp.desgn.equals("manager")) {
				emp.sal=emp.sal+1000;
			} else if(emp.desgn.equals("clerk")) {
				emp.sal=emp.sal+500;
			}
			return emp;
		};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("{Enter the name");
		String name=sc.next();
		System.out.println("{Enter the designation");
		String desgn=sc.next();
		System.out.println("{Enter the salary");
		int sal=sc.nextInt();
		
		Emp temp =new Emp(name,desgn,sal);
		temp.printDetails();
        Emp e= f.apply(temp);
        System.out.println("After update :");
        
       temp.printDetails();
	}
}
