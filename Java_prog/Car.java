public /*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
*/

/**
*
* @author anilk
*/
class Demo
{
   public void mahendra()
   {
       System.out.println("Hi");
   }
}

 /**
  * @param args the command line arguments
    */
    public class Bike extends Demo
{
  public void hero() 
   {
       System.out.println("Hello");
       
   }
}
public class Car extends Bike
{
   public static void main(String args[]) {
      Car obj = new Car();
      obj.mahendra();
      obj.hero();
       // TODO code application logic here
   }
}
