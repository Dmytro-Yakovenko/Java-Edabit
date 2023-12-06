// Repeating Letters
// Create a method that takes a string and returns a string in which each character is repeated once.

// Examples
// doubleChar("String") ➞ "SSttrriinngg"

// doubleChar("Hello World!") ➞ "HHeelllloo  WWoorrlldd!!"

// doubleChar("1234!_ ") ➞ "11223344!!__  "
// Notes
// All test cases contain valid strings. Don't worry about spaces, special characters or numbers. They're all considered valid characters.


public class DoubleChar {
    public static void main(String[] args){
        System.out.println(doubleChar("String"));
    }
    public static String doubleChar(String s) {
      String res="";
      for(int i=0; i<s.length(); i++){
        res+=""+s.charAt(i)+s.charAt(i);
      }
      return res;
    }
}