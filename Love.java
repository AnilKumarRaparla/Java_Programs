class Love
{
//Before college 
public void girl(String name){
System.out.println(name+" Loves Parents");   // output: Jessi Loves Parents
}
//she is in 1st year B.tech
public void girl(String Gname, String bfname){
System.out.println(Gname+" Loves "+bfname);  // output: Jessi Loves Anil
}
//In 2nd year college
public void girl(String gname, int age, String name){
System.out.println(gname+" Age is:"+age+" and she Loves "+name); // output: jessi Age is:20 and she Loves Kumar
}
// After final year 
public void girl(int age, String name, String Name){
System.out.println("Age is :"+age+" and "+name+" married "+Name); // output: Age is :24 and Jessi married Sampoorenesh
}
public static void main(String[] age)
{
Love love = new Love();
love.girl("Jessi");
love.girl("Jessi", "Anil");
love.girl("Jessi", 20, "Kumar");
love.girl(24, "Jessi", "Sampoorenesh");
}
}