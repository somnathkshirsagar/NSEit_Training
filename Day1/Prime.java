package Day1;
import  java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
          int num=sc.nextInt();
          int i=2;
          isPrime(num,i);
	}
	static void isPrime(int num,int i) {
		while(num>=i) {
			if(num%i ==0) {
				break;
			}
			i++;
			
		}
		if(num==i) {
			System.out.println("The Number "+num+" is Prime");
		}else {
			System.out.println("The Number "+num+" is Not Prime");
		}
	}

}
