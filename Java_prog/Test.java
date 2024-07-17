public class Test{
    public static void main(String[] args) {
      int a = 5;
      a +=6;
      switch (a-1) {
        case 5: System.out.print ("10"); break;
        case 10: System.out.print ("15");
        System.out.print(((a%2==0) ? "-even-" : "-odd-"));
        default: System.out.print (a%2); 
      }
    }
  }