import java.util.Scanner;

public class CustSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target position: ");
        int target = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j+1];
                    arr[j+1]= arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }

        System.out.println("Sorted array:");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        
        if (target >= 0 && target < n) {
            System.out.println("\nPosition: " + arr[target]);
        } else {
            System.out.println("\nInvalid target position.");
        }
                scanner.close();
    }
}
