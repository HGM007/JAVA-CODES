import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("percentage");
        Scanner S = new Scanner(System.in);
        Float a = S.nextFloat();
        Float b = S.nextFloat();
        Float c = S.nextFloat();
        Float per = a+b+c / 100;
        System.out.println(per);
    }
}
