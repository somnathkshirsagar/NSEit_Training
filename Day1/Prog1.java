package Day1;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		posRev(num);

	}
	
	static void posRev(int num) {
		int rev=0;
		if(num>=0) {
			while(num>0) {
			int n= num%10;
			System.out.print(n);
			rev += n;
			num= num/10;
			}
		}
	
		
	}

}
