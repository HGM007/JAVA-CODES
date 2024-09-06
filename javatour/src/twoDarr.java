import java.util.Random;
import java.util.Scanner;

public class twoDarr {
    public static boolean search(int mat[][],int key)
    {
        for (int i=0;i< mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++)
            {
                if (mat[i][j]==key)
                {
                    System.out.println("found at"+"("+i+","+j+")");

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("etr a");
        int sizea = s.nextInt();
        System.out.println("etr b");
        int sizeb = s.nextInt();
        int mat [][]=new int[sizea][sizeb];
        System.out.println("arr:");
//        Scanner scan=new Scanner(System.in);
//        for (int i=0;i< mat.length;i++)
//        {
//            for (int j=0;j<mat[0].length;j++)
//            {
//                mat[i][j]= scan.nextInt();
//            }
//        }
        Random r= new Random();
        for (int i=0;i< mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++)
            {
                mat[i][j]= r.nextInt(100);
            }
        }
        for (int i=0;i< mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("key=");
        Scanner scan=new Scanner(System.in);
        int k = scan.nextInt();
        search(mat,k);
    }
}
