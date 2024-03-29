// public Shuffle the Name
// Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

// Examples
// nameShuffle("Donald Trump") ➞ "Trump Donald"

// nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

// nameShuffle("Seymour Butts") ➞ "Butts Seymour"
// Notes
// There will be exactly one space between the first and last name.
// If you get stuck on a challenge, find help in the Resources tab.
// If you're really stuck, unlock solutions in the Solutions tab. {
    
// }


public class NameShuffle {
 public static void main(String[] args){
    System.out.println(nameShuffle("Trump Donald"));
 }
    public static String nameShuffle(String s) {
      String[] array = s.split(" ");
      return array[1]+" "+array[0];
     }
}
