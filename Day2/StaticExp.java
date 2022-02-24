package Day2;

public class StaticExp {
	int id;
	String name;
	String branch;
	static String org;
	
	
	static{
	    System.out.println("Inside the Static Block");	
	    org="NSEit";
	}
	
	{
		System.out.println("Inside the non static block");
	}
	
	StaticExp(){
		id=10;
		name="Hrithik";
	    branch="Mechanical";
	}
	
	StaticExp(int id,String name,String branch){
		System.out.println("Inside Parameterized Constructor 1");
		this.branch=branch;
		this.id=id;
		this.name=name;
	}
	StaticExp(String name,int id,String branch){
		System.out.println("Inside Parameterized Constructor 2");
		this.branch=branch;
		this.id=id;
		this.name=name;
	}
	
	public void getDetails() {
		System.out.println("Id :"+id+" Name :"+name+" Branch :"+branch);
	}
	public void getDetails(int id) {
		System.out.println("Overloaaded Method 1");
		System.out.println("Id :"+id+" Name :"+name+" Branch :"+branch);
	}
	public void getDetails(String name) {
		System.out.println("Overloaaded Method 2");
		System.out.println("Id :"+id+" Name :"+name+" Branch :"+branch);
	}

}
