public class Sandwiches {
	public static void main(String[] args){
		System.out.println(hasSameBread(	new String[]{"white bread", "lettuce", "toast"},
		new String[]{"white bread", "tomato", "toast"}));
	}

	public static boolean hasSameBread(String[] a, String[] b) {
		if(a[0].equals(a[a.length-1]) && b[0].equals(b[b.length-1]) && b[0].equals(a[a.length-1])){
			return true;
		}
		return false;
	} 
}