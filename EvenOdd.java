import java.util.Scanner;

class EvenOdd {
    public static void main(String args[])
    {
        Scanner resh = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Enter the number of integers: ");
       int count = resh.nextInt();

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) 
        {
           
            int num = resh.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        resh.close();
    }
}
