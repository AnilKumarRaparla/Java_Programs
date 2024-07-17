public class Casting {
    public static void main(String args[]) {
        int i = 10;
        long l = i;
        System.out.println("Long value: " + l);


        long l1 = 100;
        int i1 = (int) l1;
        System.out.println("Int value: " + i1);


        double d = 100.04;
        long l2 = (long) d;
        System.out.println("Long value: " + l2);

        
        long l3 = 100;
        byte b = (byte) l3;
        System.out.println("Byte value: " + b);
    }
    
}
