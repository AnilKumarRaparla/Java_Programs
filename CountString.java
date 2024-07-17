import java.util.HashMap;
import java.util.Map;
 import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:");
        String input = sc.next();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
System.out.println(charCount);
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            output.append(entry.getKey());
            output.append(entry.getValue());
        }

        System.out.println(output.toString());
        sc.close();

    }

}
