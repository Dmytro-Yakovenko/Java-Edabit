public class LastDig {
	public static void main(String[] args){
		System.out.println(lastDig(25, 21, 125));
	}
  public static boolean lastDig(int a, int b, int c) {
		int n1 = a%10;
		int n2 = b%10;
		int n3 = c%10;
		int temp = (n1*n2)%10;
		  return temp==n3;
  }


}
