import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class triplet {
    public static int[] trip(int[] arr, int x) {
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length-2;i++)
        {
            if (i>0 && arr[i] == arr[i-1])
                continue;
        }
        int j = i+1; int k = arr.length-1;
        while (j<k)
        {
            int add = arr[i]+arr[j]+arr[k];
            if (add<x)
                j++;
            else if (add>x) {
                k--;
            }
            else
                return new int[]{arr[i],arr[j],arr[k]};
        }
        return null;
    }
    public static void main(String[] args) {
        int i;
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
        System.out.println();
        System.out.print("enter X:");
        int x = s.nextInt();
        int[]t=trip(arr,x);
        if (t != null)
//            System.out.printf("Triplet found: [%d, %d, %d]%n", t[0], t[1], t[2]);
            System.out.println("Triplet: "+Arrays.toString(t));
        else
            System.out.println("n/a");
    }
}
