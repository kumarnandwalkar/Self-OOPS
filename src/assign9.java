import java.util.Scanner;
public class assign9 {
    public static void main(String[] args) {
        try {
            System.out.println("1] Enter values of a and b");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(" Value = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("You shouldn’t divide a number by zero \n");
        }

        int i = 0;
        int arr[] = {5, 1, 2, 7, 8, 0};
        try {
            System.out.println("2] Enter the value of index i ");
            Scanner bc = new Scanner(System.in);
            i = bc.nextInt();
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops!!! Array index " + i + " out of bounds for length " + arr.length);
        }

        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.out.println("3] Null Pointer Exception arises!! \n");
        }
    }
}