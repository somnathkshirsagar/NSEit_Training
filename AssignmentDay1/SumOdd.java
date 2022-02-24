package AssignmentDay1;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int sum=0;
		while(number>=0) {
			if(number%2 != 0) {
				sum += number;
			}
			number--;
		}
       System.out.println("The sum of odd number is "+sum);
	}

}
