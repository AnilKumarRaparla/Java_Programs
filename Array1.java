import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create an array to hold the occurrence count for each possible element value
        int[] occurrenceCounts = new int[101]; // Assuming values are between 0 and 100

        for (int i = 0; i < size; i++) {
            int element = array[i];
            occurrenceCounts[element]++;
        }

        System.out.println("Element Occurrence:");
        for (int i = 0; i < occurrenceCounts.length; i++) {
            if (occurrenceCounts[i] > 0) {
                System.out.println(i + " occurs " + occurrenceCounts[i] + " times");
            }
        }

        scanner.close();
    }
}
