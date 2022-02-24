package AssignmentDay1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProg2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] nums=new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value for index "+i);
			nums[i]=sc.nextInt();	 
		}
		System.out.println("The Sum odf Even No After Removing Duplicate is : "+sumEven(nums,size));
	}
	
     static int sumEven(int[] nums,int size) {
    	 int sum =0;
    	 Arrays.parallelSort(nums);
    	 for (int i = 0; i < size-1; i++) {
			if(nums[i] == nums[i+1]) {
				nums[i]=-1;
			}
		}
    	 
    	 for (int i = 0; i < nums.length; i++) {
			if(nums[i] != -1 && nums[i]%2== 0) {
				sum += nums[i];
			}
		}
    	 return sum;
     }

}
