// Phone Number Formatting
// Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).

// Examples
// formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"

// formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"

// formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"
// Notes
// Don't forget the space after the closing parenthesis.


public class FormatPhoneNumber {
	public static void main(String[] args){
		System.out.println(formatPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}

	public static String join(int[] arr, int startIndex, int endIndex){
		String res="";
		for(int i=startIndex; i<=endIndex; i++){
			res+=arr[i];
		}
		return res;
	}

	public static String formatPhoneNumber(int[] nums) {
		
		return "("+join(nums, 0, 2)+") "+ join(nums, 3, 5)+"-"+join(nums, 6, 9);
		
	}
}