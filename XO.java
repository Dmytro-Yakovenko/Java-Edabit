// Xs and Os, Nobody Knows
// Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.

// Rules
// Return a boolean value (true or false).
// Return true if the amount of x's and o's are the same.
// Return false if they aren't the same amount.
// The string can contain any character.
// When "x" and "o" are not in the string, return true.
// Examples
// getXO("ooxx") ➞ true

// getXO("xooxx") ➞ false

// getXO("ooxXm") ➞ true
// // Case insensitive.

// getXO("zpzpzpp") ➞ true
// // Returns true if no x and o.

// getXO("zzoo") ➞ false
// Notes
// Remember to return true if there aren't any x's or o's.
// Must be case insensitive.

public class XO {
  public static void main(String[] args){
    System.out.println(getXO("ooxx"));
  }
  public static boolean getXO (String str) {
    str=str.toLowerCase();
		int count1=0;
    int count2=0;
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i)=='x'){
        count1++;
      }else if(str.charAt(i)=='o'){
        count2++;
      }else{
        continue;
      }
    }
    return count1==count2;
  }
}