// Maximum Difference
// Given an array of integers, return the difference between the largest and smallest integers in the array.

// Examples
// difference([10, 15, 20, 2, 10, 6]) ➞ 18
// # 20 - 2 = 18

// difference([-3, 4, -9, -1, -2, 15]) ➞ 24
// # 15 - (-9) = 24

// difference([4, 17, 12, 2, 10, 2]) ➞ 15
// Notes
// N/A


public class Difference {
public static void main (String[] args){
	System.err.println(difference(new int[]{10, 15, 20, 2, 10, 6}));
}

	public static int difference(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer. MIN_VALUE;
		for(int i=0; i<nums.length; i++){
			if(nums[i]<min){
				min = nums[i];
			}
				if(nums[i]>max){
				max = nums[i];
			}

		}
		return max-min;
	}
}