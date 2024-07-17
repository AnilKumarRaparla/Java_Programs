class Oop{
String name;
int id;
public void method(String name,int id)
{
this.name = name;
this.id = id;
System.out.print("Name of the student is:"+name+ " and Id of the name:"+id);
}
public static void main(String[] args)
{
Oop obj = new Oop();
obj.method("Anil kumar", 501);
}
}

