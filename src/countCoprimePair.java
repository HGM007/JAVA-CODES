import java.util.Random;
import java.util.Scanner;

public class countCoprimePair {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean coprime(int a, int b) {
        return (gcd(a, b) == 1);
    }

    public static int primepair(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (coprime(arr[i], arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println("Number of coprime pairs: " + primepair(arr));
    }
}
