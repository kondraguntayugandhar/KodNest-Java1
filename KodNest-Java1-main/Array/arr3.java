
import java.util.Scanner;
public class arr3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter the elements: ");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Elements are : ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println("\nMaximum : "+ max);
	}
}
