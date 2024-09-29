package Assignment2809;
import java.util.*;
public class ReveseArray {
Scanner sc=new Scanner(System.in);
	
	public void array()
	{
		int[] arr= {1,2,3,4,5,6};
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println("Reverse array:"+arr[i]);
	}

	public static void main(String[] args) {
		
		ReveseArray ar=new ReveseArray();
		ar.array();

		

	}

	

}
