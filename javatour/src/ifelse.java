import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no.");
        int age;
        age=obj.nextInt();
        if(age>18){
            System.out.println("Eligible");
        }
        else {
            System.out.println("na");
        }

    }
}
