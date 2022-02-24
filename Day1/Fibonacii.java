package Day1;
import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	int num=sc.nextInt();
    	
    	int a=0, b=1,c=0;
    	System.out.print(a +" ");
    	System.out.print(b +" ");
    	
    	while(num-2 >0) {
    		c= a+b;
    		System.out.print(c +" ");
    		a=b;
    		b=c;
    		num--;
    	}
  
}
}
