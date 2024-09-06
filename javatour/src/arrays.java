//import java.util.Random;
//import java.util.Scanner;
//
//public class arrays {
//    public static void main(String[] args) {
////        array is collection of similar types of data
////        m2: dec and memory alloc
////        int[]marks=new int[5];
////        memory allocation of 5
////        array marks
////        m3: declaration,memory allocation and init together
//        int i;
//        int [] marks ={100,70,60,50,80};
//        System.out.println(marks.length);
////        System.out.println(marks[4]);
////        String [] student={"hgm","hkm","mmm","usa"};
////        System.out.println(student.length);
//        for ( i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
//        for (i=marks.length -1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }
////        printing using for-each loop
//        for (int elem:marks){
//            System.out.println(elem);
//        }
//    }
//}

import java.util.Random;
        import java.util.Scanner;

public class arrays {
    public static void print(int [] ar,int size)
    {
        for (int i=0;i<size;i++)
        {
            if (i%10==0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(ar[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner s=new Scanner(System.in);
        Random r = new Random();
        System.out.println("size of arr");
        int arrsize = s.nextInt();
        int []arr=new int[arrsize];
        for (i=0;i<arrsize;i++)
        {
            arr[i]=r.nextInt(1000);
        }
//        for (i=0;i<arrsize;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        print(arr,arrsize);
    }

}
