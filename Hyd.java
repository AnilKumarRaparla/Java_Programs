import java.util.Scanner;

public class Hyd {
    public void display() {
        System.out.println("Hyderabad");
    }

    public void display(String s) {
        System.out.println(s);
    }

    public void display(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

    public void display(String s1, String s2, String s3) {
        System.out.println(s1 + " " + s2 + " " + s3);
    }

    public static void main(String args[]) {
        Hyd h = new Hyd();
        h.display();
        h.display("I");
        h.display("I", "am");
        h.display("I", "am", "from");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("My age is: " + age);

        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
