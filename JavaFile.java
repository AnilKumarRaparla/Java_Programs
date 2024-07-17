/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
	 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Anil
 */
public class JavaFile {

    public void javaFile(int age, String name)
    {
    System.out.println("Age is:"+age);
        System.out.println("Name is:"+name);
    }
    public void javaFile(String Branch)
    {
        System.out.println("Branch Name is:"+Branch);
    }   
    public static void main(String args[]) {
        JavaFile obj = new JavaFile();
                obj.javaFile(25,"Anilkumar");
                obj.javaFile("CSE");
    }
}
