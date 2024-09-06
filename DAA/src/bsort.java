import java.util.Random;
import java.util.Scanner;

public class bsort {
    public static void Bsort(int arr[],int size)
    {

        int i,j,temp;
        for (i=0;i< size ;i++)
        {
            for (j=0;j<size-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void MBsort(int arr[],int size)
    {
        int i,j,temp;
        int flag =1;
        for (i=0;i< size && flag ==1 ;i++)
        {
            flag=-1;
            for (j=0;j<size-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            break;
        }
    }

    public static void heapify(int arr[],int i,int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxidx=i;

        if (left<size && arr[left]>arr[maxidx])
        {
            maxidx=left;
        }
        if (right<size && arr[right]>arr[maxidx])
        {
            maxidx=right;
        }
        if (maxidx!=i)
        {
            int temp = arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=arr[i];

            heapify(arr,maxidx,size);
        }
    }
    public static void heapsort(int arr[])
    {
        int i;
        int n = arr.length;
        for (i=n/2;i<=0;i--)
        {
            heapify(arr,i,n);
        }

        for (i=n-1;i<0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);

        }
    }

    public static void main(String[] args)
    {
        int i;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("size of arr ");
        int arrsize = s.nextInt();
        int arr[] =new int[arrsize];
        for (i=0;i<arrsize;i++)
        {
            arr[i]=r.nextInt(10000);
        }
        System.out.println("Generated arr");
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
        Bsort(arr,arrsize);
        for (i=0;i<arrsize;i++)
        {
            if(i%30==0)
                System.out.println();
            else
                System.out.print(arr[i]+"\t");
        }
        long end = System.nanoTime();
        long ex= end -st;
        System.out.println();
        System.out.println("time of bsort ="+ex);

        long S = System.nanoTime();
        MBsort(arr,arrsize);
        for (i=0;i<arrsize;i++)
        {
            if(i%30==0)
                System.out.println();
            else
                System.out.print(arr[i]+"\t");
        }
        long e = System.nanoTime();
        long exe=e-S;
        System.out.println();
        System.out.println("time of mbsort="+exe);

        long Se = System.nanoTime();
        heapsort(arr);
        for (i=0;i<arrsize;i++)
        {
            if (i%30==0)
            {
                System.out.println();
            }
            else
                System.out.print(arr[i]+"\t");
        }
        long ed = System.nanoTime();
        long exed=ed-Se;
        System.out.println();
        System.out.println("time of heapsort="+exed);
        System.out.println("time of bsort ="+ex);
        System.out.println("time of mbsort="+exe);
    }
}
