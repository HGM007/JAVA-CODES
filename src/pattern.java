import java.util.Scanner;

public class pattern {
//    public static void pat(int n) {
//        int i,j;
//        for (i=0;i<n;i++)
//        {
//            for (j=0;j<n;j++)
//            {
//                if (i==0 || j==0 || i==n-1 || j==n-1)
//                {
//                    System.out.println("*");
//                }
//                else
//                    System.out.println(" ");
//            }
//        }
//        System.out.println();
//    }
    public static void pat(int n)
    {
        int i,j;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=n-i;j++)
            {
                System.out.println(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pat(n);
    }
}
