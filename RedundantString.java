// Repeat String
// Create a function that takes a string t and a number n and returns the repeated string n number of times.

// Return "Not a string!" if given argument t is not a string,

// Examples
// repeatString("Tesha", 2) ➞ "TeshaTesha"

// repeatString("Deep", 3) ➞ "DeepDeepDeep"

// repeatString("Matt", 4) ➞ "MattMattMattMatt"

// repeatString(2000, 7) ➞ "Not a string!"
// Notes
// If you get stuck on a challenge, find help in the Resources tab.
// If you're really stuck, unlock solutions in the Solutions tab.

public class RedundantString {
	public static void main(String[] args){
		System.out.println(repeatString("Tesha", 2));
		System.out.println(repeatString(34, 2));
	}
	public static String repeatString(Object t, int n) {
		if(!(t instanceof String)){
			return "Not a string!";
		}
		String result = "";
		for(int i=0; i<n; i++){
			result+=t;
		}
		return result;
	}
}