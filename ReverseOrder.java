// public Reverse the Order of a String
// Create a method that takes a string as its argument and returns the string in reversed order.

// Examples
// reverse("Hello World") ➞ "dlroW olleH"

// reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

// reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
// Notes
// You can expect a valid string for all test cases. {
    
// }



public class ReverseOrder {
    public static void main(String[] args){
        System.out.println(reverse("Hello World"));
    }
  public static String reverse(final String str) {    
    String[] array = str.split("");
    String result ="";
    for(int i=array.length-1; i>=0; i--){
        result+=array[i];
    }
    return result;
  }
}
