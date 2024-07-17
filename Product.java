public class Product {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 13, 18, 29, 37, 54, 11};
        int primeCount = PrimeNum(numbers);
        System.out.println(primeCount);
    }

    public static int PrimeNum(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
