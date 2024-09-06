import java.util.Random;
import java.util.Scanner;

public class search {
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
    public static int linear_search(int[] arr, int key) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
//        insertion(arr,arrsize);
        quickSort(arr,0,arrsize-1);
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
        long st = System.nanoTime();
        int res=bsearch(arr,k);
        if (res == -1)
            System.out.println("n/a");
        else
            System.out.println("search key index is: "+res);
        long End = System.nanoTime();
        long execution = End - st;
        System.out.println("Execution time of binary search: " + execution + " nanoseconds");
        long start = System.nanoTime();
        int result = linear_search(arr,k);
        if (res == -1)
            System.out.println("n/a");
        else
            System.out.println("search key index is: "+res);
        long E = System.nanoTime();
        long Execution = E - st;
        System.out.println("Execution time of linear search: " + Execution + " nanoseconds");
    }
}
