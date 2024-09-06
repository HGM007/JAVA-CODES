import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no.");
        Random r = new Random();
        int n = s.nextInt();
        int arr[] = new int[n];
        for (i=0;i<n;i++)
        {
            arr[i]=r.nextInt(100);
        }
        System.out.print("arr:");
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        int temp;
        for (i=0;i<n;i++)
        {
//            flag=-1;
            for (j=0;j<n-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
//                    flag=1;
                }
            }
//            break;

        }
        System.out.println();
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("secound Largest term is:"+arr[arr.length-2]);


    }
    */
}
