import java.util.*;
public class assign10 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] arr = {10, 20, 30, 40, 50};
        String str = null;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("You should not divide a number by zero");
        }
        try {
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OOPs!!!Array Index 5 out of bounds for length 4");
        }
        try {
            System.out.println(getStringLength(str));
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }
        System.out.println("rest of the code");
    }

    public static int getStringLength(String str) {
        return str.length();
    }
}