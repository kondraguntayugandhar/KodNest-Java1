import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = scan.nextInt();
        System.out.println("Value is : " + a);
        System.out.println("Enter the float value");
        float b = scan.nextFloat();
        System.out.println("Value is : " + b);
        System.out.println("Enter the double value");
        double c = scan.nextDouble();
        System.out.println("Value is: " + c);
        System.out.println("Enter the long value");
        long d = scan.nextLong();
        System.out.println("Value is : " + d);
        System.out.println("Enter the short value");
        short e = scan.nextShort();
        System.out.println("Value is : " + e);
        System.out.println("Enter the byte value");
        byte f = scan.nextByte();
        System.out.println("Value is : " + f);
        System.out.println("Enter the boolean value");
        boolean g = scan.nextBoolean();
        System.out.println("Value is : " + g);
    }
}
