package Assignment2809;

public class CountArray {
	public static void main(String[] args) {
	int[]arr= {1,2,3,5,6,4,4,4};
	int count=1;
	int n=6;
	
	for(int i=0;i<arr.length-1;i++)
	{
		if (arr[i] ==n)
		{
			count++;
		}
	}
	System.out.println("Count of Array = "+count);
}
}
