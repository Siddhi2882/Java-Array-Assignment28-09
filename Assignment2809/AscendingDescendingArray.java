package Assignment2809;
import java.util.Arrays;
public class AscendingDescendingArray {
	public static void main(String[] args) {
		int[] arr= {1,99,76,23,44,5};
		int n=arr.length;
		int mid=n/2;
		Arrays.sort(arr);
		for(int i=mid; i<n; i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ans= "+Arrays.toString(arr));
	}

}
