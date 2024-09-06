import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class lastoccr {
    public static int lstoccr(int arr[], int x) {
        int l = 0;
        int h = arr.length - 1;
        int res = -1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == x) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no.");
        int n = s.nextInt();
        int arr[] = new int[n];
        Random r = new Random();
        for (i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.print("arr:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("sorted");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter no.");
        int x = s.nextInt();
        int op = lstoccr(arr, x);
        System.out.println("Last occurrence of " + x + " is " + op);
    }
}