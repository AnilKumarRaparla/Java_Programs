public class Sample {
    
    public static void main(String args[])
    {
        int a =5;
        int b =2;
        int total = a+(a>6?++b : --b);
        System.out.println(total);
    }
}