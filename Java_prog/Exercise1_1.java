import java.util.Scanner;

public class Exercise1_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double radius = s.nextDouble();
    if (radius <= 0) {
      System.out.println("Please enter non zero positive number");
    } else {
      double perimeter = 2 * Math.PI * radius;
      double area = Math.PI * radius * radius;
      System.out.println("Perimeter of the circle is: " + perimeter);
      System.out.println("Area of the circle is: " + area);
    }
  }
}
