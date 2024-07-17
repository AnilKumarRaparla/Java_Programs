import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter a number: ");
			int n = sc.nextInt();
			
			Factorial(n);
		}
		
    }
    public static void Factorial(int n) {
       
        int fact = 1;
        
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        
        System.out.print("The factorial of " + n + " is: " + fact);
    }
}
