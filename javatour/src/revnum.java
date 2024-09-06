import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        System.out.println("etr no.");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        while(n>0)
        {
            int ls= n %10;
            rev=(rev*10)+ls;
            n=n/10;
        }
        System.out.println("reverse num is "+rev);

    }
}
