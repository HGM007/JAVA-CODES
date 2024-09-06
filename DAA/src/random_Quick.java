import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class random_Quick {

        // Function to swap two elements
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Function to partition the array
        static int partitionLeft(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low;
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    swap(arr, i, j);
                    i++;
                }
            }
            swap(arr, i, high);
            return i;
        }
        // Function to perform random partition
        static int partitionRight(int[] arr, int low, int high) {
            Random rand = new Random();
            int r = low + rand.nextInt(high - low);
            swap(arr, r, high);
            return partitionLeft(arr, low, high);
        }
        // Recursive function for quicksort
        static void quicksort(int[] arr, int low, int high) {
            if (low < high) {
                int p = partitionRight(arr, low, high);
                quicksort(arr, low, p - 1);
                quicksort(arr, p + 1, high);
            }
        }


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            System.out.println("enter size of arr");
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=r.nextInt(1000);
            }
//            System.out.print("Original array: ");
//            for(int i=0;i< n;i++)
//            {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
            long st = System.nanoTime();
            quicksort(arr, 0, n - 1);
            long en = System.nanoTime();
            long T = en - st ;
            System.out.println("Time:"+T);
//            System.out.print("Sorted array: ");
//            for(int i=0;i< n;i++)
//            {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
        }

}
