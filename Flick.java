// Flick Switch
// Create a function that always returns true for every item in a given array. However, if an element is the word "flick", switch to always returning the opposite boolean value.

// Examples
// switches(["edabit", "flick", "eda", "bit"]) ➞ [true, false, false, false]

// switches(["flick", 11037, 3.14, 53]) ➞ [false, false, false, false]

// switches([false, false, "flick", "sheep", "flick"]) ➞ [true, true, false, false, true]
// Notes
// "flick" will always be given in lowercase.
// An array may contain multiple flicks.
// Switch the boolean value on the same element as the flick itself.


public class Flick {
  public static void main(String[] args){
    Boolean[] res=switches(new Object[] {false, false,"flick", "sheep", "flick"});
    for( int i=0; i<res.length; i++){
      System.out.println(res[i]);
    }
  }
  public static Boolean[] switches(Object[] t) {
    Boolean[] result = new Boolean[t.length];
    Boolean flag = true;
		for(int i=0; i<t.length; i++){
     if( t[i].toString().equals("flick")){
      flag = !flag;
     };
      
      result[i]=flag;

    }
    return result;
  }
}
