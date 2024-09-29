package Assignment2809;
import java.util.*;
public class Array {
	Scanner sc=new Scanner(System.in);
	public void Max() {
		int[]a= {1,2,3,4,5,6};
		int max=a[0];
		for (int i=1;i<a.length;i++)
		{
			if( a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Max is : "+max);
	}
	public void Average() {
		int[]a= {1,2,3,4,5,6};
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		double avg=sum/a.length;
		System.out.println("Average of element is : "+avg);
	}
		public static void main(String[] args) {
			Array array= new Array();
			array.Max();
			array.Average();

}
}
