// Equality of 3 Values
// Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

// Examples
// equal(3, 4, 3) ➞ 2

// equal(1, 1, 1) ➞ 3

// equal(3, 4, 1) ➞ 0
// Notes
// Your function must return 0, 2 or 3.

public class Equal {
	public static void main(String[] args){
		System.out.println(equal(3, 4, 3));
	}
	public static int equal(int a, int b, int c) {
		if(a==b && a==c){
			return 3;
		}else if(a==b){
			return 2;
		}else if(a==c){
			return 2;
		}else if(b==c){
			return 2;
		}else{
			return 0;
		}
	}
}