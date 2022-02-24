package AssignmentDay1;

public class ArrayProgram1 {

	public static void main(String[] args) {
		int[] nums= {10,15,20,25,30,100};
		int target=15;
		System.out.println(oddSumRev(nums,target));
	}
	static int oddSumRev(int[] nums,int target) {
		int answer =0;
		int sum=0;
	    for (int i = 0; i < nums.length; i++) {
			if(nums[i]> target) {
				sum +=nums[i];
			}
		}
	    answer= reverse(sum);
		return answer;
	}
	static int reverse(int sum) {
		int rev=0;
		while(sum>0) {
			int n= sum%10;
			rev=rev*10+n;
			sum=sum/10;
		}
		return rev;
	}

}
