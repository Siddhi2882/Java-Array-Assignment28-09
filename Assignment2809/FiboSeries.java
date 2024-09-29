package Assignment2809;

public class FiboSeries {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=2; i<arr.length; i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=2; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			

	}

}
