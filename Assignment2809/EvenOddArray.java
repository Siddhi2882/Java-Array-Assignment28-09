package Assignment2809;

public class EvenOddArray {
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,7,6};
	int even=0;
	int odd=0;
	for(int i=0; i<arr.length;i++)
	{
		if(arr[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println("Odd Numbers are: "+odd);
	System.out.println("Even Numbers are: "+even);

}
}
