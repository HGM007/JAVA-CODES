import java.util.Scanner;

public class sumofNnum {
//    public static void main(String[] args) {
//        System.out.println("etr no.");
//        Scanner s = new Scanner(System.in);
//        int n=s.nextInt();
//        int sum = (n*(n+1))/2;
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        System.out.println("etr no.");
//        Scanner s = new Scanner(System.in);
//        int n=s.nextInt();
//        int sum=0;
//        for (int i=1;i<=n;i++)
//        {
//            sum=sum+i;
//        }
//        System.out.println("sum = "+sum);

//}
    public static void main(String[] args) {
        System.out.println("etr no.");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum="+sum);
}
}
