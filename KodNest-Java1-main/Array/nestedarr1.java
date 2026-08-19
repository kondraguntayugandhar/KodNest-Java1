import java.util.Scanner;

public class nestedarr1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[3][5];
        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                arr[i][j] = scan.nextInt();

            }
        }
        System.out.println("Elements are : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}