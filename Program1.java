// Are the Numbers Equal?
// Create a function that returns true when x is equal to y; otherwise return false.

// Examples
// isSameNum(4, 8) ➞ false

// isSameNum(2, 2) ➞  true

// isSameNum(42, 32) ➞  false
// Notes
// Don't forget to return the result.

public class Program1 {
	public static void main(String[] args){
		System.out.println(isSameNum(3,4));
	}
	public static boolean isSameNum(int x, int y) {
		return x==y;
	}
}