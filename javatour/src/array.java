
//import java.util.ArrayList;
//import java.util.Collections;  // Import the Collections class
//import java.util.Scanner;
//
//public class array {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);  // Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int i;
        System.out.println("etrn size");
        Scanner s=new Scanner(System.in);
        int arrsize=0;
        if (s.hasNextInt())
        {
            arrsize=s.nextInt();
        }
        int []arr=new int[arrsize];
        System.out.println("srr elem");
        for ( i=0;i<arrsize;i++)
        {
            if (s.hasNextInt())
            {
                arr[i]= s.nextInt();
            }
        }
        System.out.println("elem are ");
        for (i=0;i<arrsize;i++)
        {
            System.out.print(arr[i]+" ");
        }

        s.close();
    }
}
