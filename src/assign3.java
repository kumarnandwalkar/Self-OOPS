//Write a program to take the input array element and convert all the elements into next prime
// numbers and display the changed array

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;



class methode
{
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public static int nextPrime(int num) {
        if (num <= 1)
            return 2;
        int prime = num;
        boolean found = false;
        while (!found) {
            prime++;
            if (isPrime(prime))
                found = true;
        }
        return prime;
    }
    public static int[] convertToNextPrime(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = nextPrime(arr[i]);
        }
        return result;
    }
}
public class assign3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        methode newmtd = new methode();
        int[] result = newmtd.convertToNextPrime(arr);

        System.out.println("Changed array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
