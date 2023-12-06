// Get Word Count
// Create a method that takes a string and returns the word count. The string will be a sentence.

// Examples
// countWords("Just an example here move along") ➞ 6

// countWords("This is a test") ➞ 4

// countWords("What an easy task, right") ➞ 5
// Notes
// If you get stuck on a challenge, find help in the Resources tab.
// If you're really stuck, unlock solutions in the Solutions tab.
public class CountWords {
	public static void main(String[] args){
		System.out.println(countWords("Just an example here move along"));
	}
	public static int countWords(String s) {
		int count =0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==' '){
				count++;
			}
		}
		return count+1;
	}
}