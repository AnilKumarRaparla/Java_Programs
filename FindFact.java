import java.util.Scanner;

public class FindFact {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        if(a==0)
        {
            System.out.println("No Factors");
        }
        else
        {
            System.out.println("1");
            for(int i = 2; i <=a; i++)
            {
                if(a%i==0)
                {
                    System.out.print(i+" ");
                 }
                 
            }
        }
            
            System.out.println();
        
        sc.close();
    }
    
}
