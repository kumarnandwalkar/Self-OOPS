import java.util.*;

public class assign7 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = SC.nextLine();

        SC.close();

        String[] words = str.split("\\s+");

        Arrays.sort(words);

        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equalsIgnoreCase(words[i + 1])) {
                count++;
                while (i < words.length - 1 && words[i].equalsIgnoreCase(words[i + 1])) {
                    i++;
                }
            }
        }
        System.out.println("Number of duplicate words: " + count);
    }
}