import java.util.List;
import java.util.ArrayList;

public class IntegerExample {
    public static void main(String[] args) {
        // Declaring an Integer variable
        Integer myInteger = 42;

        // Converting Integer to int
        int myInt = myInteger.intValue();
        System.out.println("Value of myInt: " + myInt);

        // Converting int to Integer
        int anotherInt = 99;
        Integer anotherInteger = anotherInt;
        System.out.println("Value of anotherInteger: " + anotherInteger);

        // Performing arithmetic operations using Integer objects
        Integer sum = myInteger + anotherInteger;
        System.out.println("Sum: " + sum);

        // Parsing a String to Integer
        String numberString = "123";
        Integer parsedInteger = Integer.parseInt(numberString);
        System.out.println("Parsed Integer: " + parsedInteger);

        // Using Integer in collections
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);
        System.out.println("Number List: " + numberList);
    }
}
