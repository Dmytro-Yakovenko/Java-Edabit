// public The 3 Programmers Problem
// You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.

// Examples
// programmers(147, 33, 526) ➞ 493

// programmers(33, 72, 74) ➞ 41

// programmers(1, 5, 9) ➞ 8
// Notes
// Don't forget to return the result.
// If you get stuck on a challenge, find help in the Resources tab.
// If you're really stuck, unlock solutions in the Solutions tab. {
    
// }

public class Programmers {
  public static void main(String[] args){
    System.out.println(programmers(147, 33, 526));
  }
	public static int programmers(int one, int two, int three) {
		int min=Math.min(three,Math.min(one,two));
    	int max=Math.max(three,Math.max(one,two));
      return max-min;
  }
}
