import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        int i;
        boolean isprime=true;
        System.out.println("ETR no.");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        for(i=2;i<=num-1;i++)
        {
            if (num%i==0) {
                isprime = false;
            }

        }
        if (isprime==true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("n/a");
        }
    }
}
