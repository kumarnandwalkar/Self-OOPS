import java.util.*;
class Adder {
    private int[] dataArray;
    private int targetSum;
    public Adder() {
        dataArray = null;
        targetSum = 0;
    }
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        dataArray = new int[size];

        System.out.println("Enter Unique integers for the array:");

        for (int i = 0; i < size; i++) {
            int input;
            boolean isDuplicate;

            do {
                isDuplicate = false;
                System.out.print("Element " + (i + 1) + ": ");
                input = scanner.nextInt();

                for (int j = 0; j < i; j++) {
                    if (dataArray[j] == input) {
                        System.out.println("Duplicate detected. Please enter a distinct integer.");
                        isDuplicate = true;
                        break;
                    }
                }

            } while (isDuplicate);
            dataArray[i] = input;
        }
        System.out.print("Enter the target sum: ");
        targetSum = scanner.nextInt();
    }
    public int[] numSum() {
        for (int i = 0; i < dataArray.length - 1; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[i] + dataArray[j] == targetSum) {
                    return new int[]{dataArray[i], dataArray[j]};
                }
            }
        }
        return new int[]{};
    }
}
public class assign2 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.getData();
        int[] result = adder.numSum();
        System.out.println(Arrays.toString(result));
    }
}