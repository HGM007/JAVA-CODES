import java.util.Random;
import java.util.Scanner;

public class sort {
    public static void insertion(int []arr,int n)
    {
        for(int i=1;i<n-1;i++)
        {
            int curr = arr[i]; // temp memory for storage
            int prev = i-1;
            while (prev>=0 && arr[prev]>curr) // find out the current position to insert
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void selection(int []arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int minpos=i;
            for (int j=i+1;j<n;j++)
            {
                if (arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("ETR size N: ");
        Scanner s= new Scanner(System.in);
        Random r = new Random();
        int asize = s.nextInt();
        int []a=new int[asize];
        for (int i=0;i<asize;i++)
        {
            a[i]=r.nextInt(1000);
        }
        System.out.println("Generated arr: ");
        for (int i=0;i<asize;i++)
        {
            if (i%30==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(a[i]+"\t");
            }
        }
//        insertion(a,asize);
        selection(a,asize);
        System.out.println();
        System.out.print("sorted arr: ");
        System.out.println();
        for (int i=0;i<asize;i++)
        {
            if (i%30==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(a[i]+"\t");
            }
        }
    }
}
