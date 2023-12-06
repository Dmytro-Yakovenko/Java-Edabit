public class Countdown {
    public static void main(String[] args){
        int[] arr= countdown(5);
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
	public static int[] countdown(int start) {
		int[] array = new int[start+1];
        int j=0;
        for(int i=start; i>=0; i--){
            array[j]=i;
            j++;
        }
        return array;
	}
}