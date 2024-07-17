import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
public class dcount {
    static void calc(int arr[]){
        String s;
        int sum=0;
        for(int i=0;i<=arr.length;i++)
        {
            s=Integer.toString(arr[i]);
            for(char j : s.toCharArray()){
                sum=sum+(int)(j);
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        calc(arr);
        sc.close();
    }
}
