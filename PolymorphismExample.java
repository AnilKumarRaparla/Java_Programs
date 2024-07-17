class Person {
  public void makeSound() {
    System.out.println("He has Two legs and two Hands");
  }
}
 
class Anil extends Person {
  public void makeSound() {
    System.out.println("Anil makes more noise in class room");
  }
}

class Faculty extends Person {
  public void makeSound() {
    System.out.println("Faculty gives HomeWork to the Anil");
  }
}
public class PolymorphismExample {
  public static void main(String[] args) {
    Person PersonObj = new Person();
    Anil AnilObj = new Anil();
    Faculty FacultyObj = new Faculty();
    PersonObj.makeSound();
    AnilObj.makeSound();
  FacultyObj .makeSound();
  }
}
