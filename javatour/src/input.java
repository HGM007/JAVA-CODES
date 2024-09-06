
    import java.util.Scanner;

    public class input {
        public static void main(String[] args) {
            System.out.println("taking input");
            Scanner S = new Scanner(System.in);
            System.out.println("input a");
            int a = S.nextInt();
            System.out.println("input b");
            int b = S.nextInt();
            System.out.println("sum is = ");
            int sum = a + b;
            System.out.println(sum);
            S.close();
        }
    }
// to read input from user java has scanner class
// System.in is use to input from keyboard

