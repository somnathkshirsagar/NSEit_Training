package Day3;

@FunctionalInterface
interface Square{
	public double areaSquare(int length);
	
}

@FunctionalInterface
interface Triangle{
	public double areaTriangle(int length,int height);
	
}


public class LambdaExpTest {

	public static void main(String[] args) {
		Square s1= (length) -> length*length;
		
		System.out.println("The Area of Square is : "+s1.areaSquare(10));
		
		Triangle t1=(length,height) -> (length*height)/2;
		
		System.out.println("The Area of Square is : "+t1.areaTriangle(10,30));
	}
	


}
