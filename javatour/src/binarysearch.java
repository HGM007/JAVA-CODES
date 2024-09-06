import java.util.Random;
import java.util.Scanner;

public class binarysearch {
    public static int bsearch(int []arr,int key)
    {
        int start=0, end=arr.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if (arr[mid]==key)
            {
                return mid;
            } else if (arr[mid]<key)
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
//    public static void insertion(int[] arr,int n)
//    {
//        for(int i=1;i<n-1;i++)
//        {
//            int curr = arr[i]; // temp memory for storage
//            int prev = i-1;
//            while (prev>=0 && arr[prev]>curr) // find out the current position to insert
//            {
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1]=curr;
//        }
//    }
    public static void bsort(int[]a,int size)
    {
        int i,j,temp;
        for (i=0;i<size;i++)
        {
            for (j=0;j<size-1-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        long st = System.nanoTime();
        int i;
        Scanner s=new Scanner(System.in);
        Random r = new Random();
        System.out.println("size of arr");
        int arrsize = s.nextInt();
        int []arr=new int[arrsize];
        for (i=0;i<arrsize;i++)
        {
            arr[i]=r.nextInt(1000);
        }
        System.out.println("Generated arr: ");
        for (i=0;i<arrsize;i++)
        {
            if (i%30==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(arr[i]+"\t");
            }
        }
//        insertion(arr,arrsize);
        bsort(arr,arrsize);
        System.out.println();
        System.out.println("Sorted arr: ");
        for (i=0;i<arrsize;i++)
        {
            if (i%30==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();
        System.out.println("etr key: ");
        Scanner scan=new Scanner(System.in);
        int k= scan.nextInt();
        int res=bsearch(arr,k);
        if (res == -1)
            System.out.println("n/a");
        else
            System.out.println("search key index is: "+res);
        long End = System.nanoTime();
        long execution = End - st;
        System.out.println("Execution time: " + execution + " nanoseconds");

    }
}
