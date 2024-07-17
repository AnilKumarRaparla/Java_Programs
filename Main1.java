import java.util.Scanner;

class Main1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
sc.close();
String res = "";
int count = 1;
char prev = str.charAt(0);
for(int i = 1; i < str.length(); i++)
{
if(str.charAt(i)==prev)
{
count ++;
}
else {
res += prev +""+ count;
prev = str.charAt(i);
count = 1;
}
}
res += prev+""+count;
System.out.println(res+"");
}
}