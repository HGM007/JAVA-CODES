import java.util.Random;
import java.util.Scanner;

public class greedy_algo {
    public static int knapSack(int W, int []wt, int []val, int n) {
        int i, w;
        int[][] K = new int[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    // Driver program to test above function
    public static void main(String[] args) {
//        M 1
//        int []val = new int[] { 60, 100, 120 };
//        int []wt = new int[] { 10, 20, 30 };
//        int W = 50;
//        int n = val.length;
//        System.out.println(knapSack(W, wt, val, n));

//        M 2
//        int i,W;
//        System.out.println("enter weight:");
//        Scanner scan = new Scanner(System.in);
//        W = scan.nextInt();
//        Scanner s = new Scanner(System.in);
//        Random r =new Random();
//        System.out.println("Enter size of arr");
//        int arrsize = s.nextInt();
//        int []val = new int[arrsize];
//        for (i=0;i<arrsize;i++)
//        {
//            val[i]=r.nextInt(10000);
//        }
//
//        int []wt = new int[arrsize];
//        for (i=0;i<arrsize;i++)
//        {
//            wt[i]=r.nextInt(100);
//        }
//
//        for (i=0;i<arrsize;i++)
//        {
//            System.out.print(val[i]+" ");
//        }
//        System.out.println();
//        for (i=0;i<arrsize;i++)
//        {
//            System.out.print(wt[i]+" ");
//        }
//        System.out.println();
//        System.out.println("The output is:");
//        System.out.println(knapSack(W,wt,val,arrsize));

//        M 3
        int i,W;
        System.out.println("enter weight");
        Scanner scan = new Scanner(System.in);
        W = scan.nextInt();
        System.out.println("Enter size arr :");
        int arrsize = scan.nextInt();
        System.out.println("Enter Value arr :");
        int []val = new int[arrsize];
        for (i=0;i<arrsize;i++)
        {
            val[i]= scan.nextInt();
        }
        for (i=0;i<arrsize;i++)
        {
            System.out.print(val[i]+" ");
        }
        System.out.println();
        System.out.println("Enter Weight arr :");
        System.out.println();
        int []wt = new int[arrsize];
        for (i=0;i<arrsize;i++)
        {
            wt[i]= scan.nextInt();
        }
        for (i=0;i<arrsize;i++)
        {
            System.out.print(wt[i]+" ");
        }
        System.out.println();
        System.out.println("The output is:");
        System.out.println(knapSack(W,wt,val,arrsize));

    }
}

//value = profit
// according to p/w object are selected
//total profit = xi*pi
// xi is index of p/w value highest value gets lower index



