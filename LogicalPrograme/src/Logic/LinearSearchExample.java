package Logic;

public class LinearSearchExample {

	public static int linear(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int key=40;
	System.out.println(LinearSearchExample.linear(arr, key));
		
	}
}
