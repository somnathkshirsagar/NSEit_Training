package Day1;

import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		sumOdd(n);
		
	}
	static void sumOdd(int n) {
		int sum=0;
		for(;n>0;n=n/10) {
			int rem= n%10;
			if(rem%2 != 0) {
				sum += rem;
			}
		}
		System.out.println(sum);
	}

}
