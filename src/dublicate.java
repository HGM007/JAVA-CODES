import java.util.Random;
import java.util.Scanner;

public class dublicate {
        public static void main(String[] args) {
            int i, j;
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            System.out.print("Enter size: ");
            int n = s.nextInt();
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = r.nextInt(100);
            }
            System.out.print("Array: ");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (i = 0; i < n; i++) {
                for (j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j])
                        System.out.print("DUB: " + arr[j] + " ");
                }
            }
        }
    }
