public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return "" + n;
        }
    }

}
