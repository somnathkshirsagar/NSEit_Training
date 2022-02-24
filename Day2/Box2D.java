package Day2;

public class Box2D {
	int length;
	int breadth;
	
	Box2D(){
		this(10,20);
		System.out.println("Inside the Default Constructor");
		length= 1;
		breadth=1;
	}
	
	Box2D(int length,int breadth){
	
		System.out.println("Inside the Parameterized Constructor");
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calArea() {
		System.out.println("Area of box is  "+(length*breadth));
	}

}
