import java.util.Random;
import java.util.Scanner;

public class Bubblesort {
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
        long st = System.nanoTime();
        bsort(arr,arrsize);
        System.out.print("\n"+"sorted arr: ");
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
        long end=System.nanoTime();
        long ex = end-st;
        System.out.println();
        System.out.println("time="+ex);
    }

}
