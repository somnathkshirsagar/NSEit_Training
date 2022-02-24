package AssignmentDay1;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
        int num= sc.nextInt();
        System.out.println(Arrays.toString(fiboo(num)));
	}
	
	static int[] fiboo(int num ) {
    	int a=0, b=1,c=0;
    	int[] arr= new int[num];
    	
    	arr[0]=a;
    	arr[1]=b;
    	
    	for(int i=2;num-2 >0;i++) {
    		c= a+b;
    		arr[i]=c;
    		a=b;
    		b=c;
    		num--;
    	}
    	return arr;
    	}
}


