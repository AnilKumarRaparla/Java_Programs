import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        printElement(array);
        printMax(array);
        printMinOccurrences(array);
    }
// Print the no of occurences

    public static void printElement(int[] array) {
        int n = array.length;
        boolean[] visit = new boolean[n];

        System.out.println("Element Occurrences:");
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visit[j] = true;
                        count++;
                    }
                }
                System.out.println(array[i] + ": " + count + " times");
                
            }
        }
    }

    // print Max Occurences
    public static void printMax(int[] array) {
        int maxCount = 0;
        int max = 0;
        int n = array.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    max = array[i];
                }
            }
        }
        System.out.println("Element(s) with the maximum occurrence:");
        System.out.println(max + ": " + maxCount + " times");
    }

    // print Minimum Occurrences
    public static void printMinOccurrences(int[] array) {
        int minCount = 1000;
        int min = 0;
        int n = array.length;
        boolean[] visited = new boolean[n];
    
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if (count < minCount) {
                    minCount = count;
                    min = array[i];
                }
            }
        }
        System.out.println("Element(s) with the minimum occurrence:");
        System.out.println(min + ": " + minCount + " times");
    }
    
}