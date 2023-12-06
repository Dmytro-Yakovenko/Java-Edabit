import java.util.Arrays;

public class SortNumsAscending {
	public static void main(String[] args){
		System.out.println(sortNumsAscending(new int[] {1, 2, 10, 50, 5}));
	}
	public static int[] sortNumsAscending(int[] nums) {
		 
		Arrays.sort(nums);
		 return nums;
	}
}