import java.util.Random;
import java.util.Scanner;

public class MDArr {
    public static void modify(int arr[]){
        int i;
        for (i=0;i<arr.length;i++)
        {
            if (i%2==0)
                arr[i]+=10;
            else
               arr[i]*=2;
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("enter size:");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (i=0;i<n;i++){
            arr[i]= r.nextInt(100);
        }
        System.out.println();
        System.out.print("arr:");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        modify(arr);
        System.out.print("Marr:");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
