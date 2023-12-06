// public Re-Form the Word
// A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.

// Examples
// getWord("seas", "onal") ➞ "Seasonal"

// getWord("comp", "lete") ➞ "Complete"

// getWord("lang", "uage") ➞ "Language"
// Notes
// N/A {
    
// }
public class GetWord {
	public static void main(String[] args){
		System.out.println(getWord("seas", "onal"));
	}

	public static String getWord(String left, String right) {
		String first = left.substring(0,1);
		
		String rest = left.substring(1);
		return first.toUpperCase()+rest+right;
	}
}