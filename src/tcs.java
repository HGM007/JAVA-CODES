import java.util.Scanner;

public class tcs {
    public static int race(int n1,int n2,int x){
        int c1 = x;
        int c2 = 0;
        int t = 1;
        if (n1>n2)
            return -1;
        if (x==0 || n1==n2)
            return -1;
        while(n1>n2)
            c1 += n1;
            c2 += n2;
            t++;
        return t;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int x = s.nextInt();
        System.out.println(race(n1,n2,x));
    }
}
