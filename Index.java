import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Loop through the array to find unique values and their indexes
        for (int i = 0; i < size; i++) {
            int value = array[i];
            boolean isDuplicate = false;

            // Check for duplicates before the current index
            for (int j = 0; j < i; j++) {
                if (array[j] == value) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            // Find and display indexes where the value occurs
            System.out.print("Value " + value + " found at index(es): " + i);
            for (int j = i + 1; j < size; j++) {
                if (array[j] == value) {
                    System.out.print(", " + j);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
