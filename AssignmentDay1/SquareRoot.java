package AssignmentDay1;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value at x1 position");
        int x1=sc.nextInt();
        System.out.println("Enter the value at x2 position");
        int x2=sc.nextInt();
        System.out.println("Enter the value at y1 position");
        int y1=sc.nextInt();
        System.out.println("Enter the value at y2 position");
        int y2=sc.nextInt();
        
        double distance= Math.sqrt(((x1-x2)*(x1-x2)) +((y1-y2)*(y1-y2)));
        
        System.out.println("The Distance between points is : "+distance);
        
	}

}
