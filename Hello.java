class Hello
{
int id;
int age;
public void display()
{
this.id=id;
this.age=age;
System.out.println("Student ID: "+id+" and Age is: "+age);
}
public static void main(String args[])
{
Hello obj = new Hello();
obj.id=15;
obj.age=27;
obj.display();
}}  