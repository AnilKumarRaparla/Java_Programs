import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 1 && b >= a) {
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Provide valid input");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}