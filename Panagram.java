import java.util.Scanner;

public class Panagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String s = ss.toUpperCase();
        if(0>s.length())
        {
            System.out.println("Not a panagram");
        }

        sc.close();

    }
}
