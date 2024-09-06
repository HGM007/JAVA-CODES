import java.util.Arrays;

public class largersmallersum {
    public static void main(String[] args) {
        int i, count = 0;
        int[] arr = {2, 1, 4, 6, 3, 1};
        int n = arr.length;
        int[] even = new int[n / 2];  // Array to hold even numbers
        Arrays.sort(arr);  // Sort the array

        // Print the sorted array
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Collect even numbers in the 'even' array
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[count++] = arr[i];
            }
        }

        // Print the even numbers
        for (i = 0; i < count; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
