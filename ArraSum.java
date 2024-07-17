import java.util.Scanner;

public class ArraSum {
    public static void main(String[] args) {
        search();
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0; // Initialize the cumulative sum
        for (int i = 0; i < n; i++) {
            sum += arr[i]; 
            arr[i] = sum; 
        }

        System.out.println("Array Elements after cumulative sum:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
