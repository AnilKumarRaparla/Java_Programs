import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        int[] inputList = new int[size];
        System.out.println("Enter the elements of the list:");

        // Dynamically read elements from the user
        for (int i = 0; i < size; i++) {
            inputList[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Original List:");
        printArray(inputList);

        int[] elementCounts = countOccurrences(inputList);
        System.out.println("Duplicate Elements Count:");
        printDuplicateElementCounts(inputList, elementCounts);

        // Rearrange the list with distinct elements first in ascending order
        int[] rearrangedListAsc = rearrangeList(inputList, true);
        System.out.println("List with Distinct Elements First (Ascending Order):");
        printArray(rearrangedListAsc);

        // Rearrange the list with distinct elements first in descending order
        int[] rearrangedListDesc = rearrangeList(inputList, false);
        System.out.println("List with Distinct Elements First (Descending Order):");
        printArray(rearrangedListDesc);
    }

    // Method to count occurrences of each element in the list
    public static int[] countOccurrences(int[] inputList) {
        int[] elementCounts = new int[inputList.length];

        for (int i = 0; i < inputList.length; i++) {
            int count = 1;
            for (int j = i + 1; j < inputList.length; j++) {
                if (inputList[i] == inputList[j]) {
                    count++;
                }
            }
            elementCounts[i] = count;
        }

        return elementCounts;
    }

    // Method to print counts of duplicate elements
    public static void printDuplicateElementCounts(int[] inputList, int[] elementCounts) {
        for (int i = 0; i < inputList.length; i++) {
            if (elementCounts[i] > 1) {
                System.out.println(inputList[i] + ": " + elementCounts[i] + " times");
            }
        }
    }

    // Method to rearrange the list with distinct elements first
    public static int[] rearrangeList(int[] inputList, boolean ascending) {
        int[] rearrangedList = new int[inputList.length];
        int distinctIndex = 0;

        // First, add distinct elements to the rearranged list
        for (int i = 0; i < inputList.length; i++) {
            boolean isDistinct = true;
            for (int j = i + 1; j < inputList.length; j++) {
                if (inputList[i] == inputList[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                rearrangedList[distinctIndex++] = inputList[i];
            }
        }

        // Then, sort the distinct elements using bubble sort (either in ascending or descending order)
        if (ascending) {
            bubbleSortAscending(rearrangedList, distinctIndex);
        } else {
            bubbleSortDescending(rearrangedList, distinctIndex);
        }

        return rearrangedList;
    }

    // Bubble sort in ascending order
    public static void bubbleSortAscending(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort in descending order
    public static void bubbleSortDescending(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
