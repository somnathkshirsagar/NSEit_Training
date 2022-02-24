package AssignmentDay3;

import java.util.Scanner;

public class NoOfSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s= sc.nextLine();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch== ' ')
				count++;
		}
		System.out.println("The No Of Spaces in Sentence is : "+count);

	}

}
