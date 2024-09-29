package Assignment2809;
import java.util.*;
public class RotationArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,5,6,9};
		int n = arr.length;

		System.out.println("Original Array: " + Arrays.toString(arr));

		int lastElement = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastElement;
		System.out.println("After Right Rotation: " + Arrays.toString(arr));

		int firstElement = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = firstElement;
		System.out.println("After Left Rotation: " + Arrays.toString(arr));
	}
		
		
	}
		
	
