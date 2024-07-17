import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // read input string
        sc.close();
        
        String result = "";
        int count = 1;
        char prev = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prev) {
                count++;
            } else {
                result += prev + "" + count;
                prev = str.charAt(i);
                count = 1;
            }
        }
        
        // Add the last character and its count to the result string
        result += prev + "" + count;
        
        System.out.println(result);
    }
}
