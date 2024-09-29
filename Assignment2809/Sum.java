package Assignment2809;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number= ");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=d;
			n=n/10;
		}
		if(num%sum==0)
		System.out.println("It is Harshad's number"+num);
		else
			System.out.println("It is not Harshad's number"+num);
	}
}
