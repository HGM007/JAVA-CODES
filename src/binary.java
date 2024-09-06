import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class binary {
    public static int search(int[] arr, int k) {
        int start=0, end=arr.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if (arr[mid]==k)
            {
                return mid;
            } else if (arr[mid]<k)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
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
        Arrays.sort(arr);
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("etr key :");
        int k = s.nextInt();
        int res = search(arr,k);
        if (res == -1)
        {
            System.out.println("N/a");
        }
        else
        {
            System.out.println("found in "+res);
        }
    }
}
