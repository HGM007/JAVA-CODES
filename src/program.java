import java.util.Scanner;
import java.util.*;
public class program {
    public static int lss(int arr[],int n){
        // largesmallsum
        int i,evensum=0,oddsum=0;
        int[] even = new int[n / 2];
        int[] odd = new int[n - n / 2];
        if (arr.length <= 3)
            return 0;
        else
            Arrays.sort(arr);
            for (i=0;i< arr.length;i++)
                if (i%2 == 0)
                    even[evensum++] = arr[i];
                else
                    odd[oddsum++] = arr[i];
        for (i=0;i<even.length;i++)
            System.out.println(even[i]);
        for (i=0;i<odd.length;i++)
            System.out.println(odd[i]);

        int largestOdd = odd[odd.length - 1];
        int secondLargestEven = even[even.length - 2];

        return largestOdd + secondLargestEven;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt ();
        System.out.println(lss(arr,n));
    }
}


// 1
/* public static int checkpass(String str,int n){
        if(n<4)
            return 0;
        if (str.charAt(0) >= '0' && str.charAt(0)<='9' )
            return 0;
        int i,num = 0, sum =0 ;
        for (i=0;i<n;i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/')
                return 0;
            if (str.charAt(i) >='A' && str.charAt(i)<='Z')
                sum++;
            if (str.charAt(i) >='1' && str.charAt(i)<='9')
                num++;
        }
        if (num>0 && sum<0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    System.out.println(checkpass(str,str.length()));

    }*/

// 2
/*public static int  findCount(int arr[] ,int len,int num,int diff ) {
    int i , count=0;
    for (i=0;i<arr.length;i++)
    {
        if (Math.abs (num - arr[i]) <= diff)
            count ++;
    }
    return count > 0 ? count : -1;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        int num = sc.nextInt ();
        int diff = sc.nextInt ();

        System.out.println (findCount (arr, n, num, diff));
    }*/
//3
/*

public static int []nextgreater(int arr[]) {
        int i,j;
        int n = arr.length;
        int [] res  = new int[n];
        int next = -1;
        for (i=0;i<arr.length;i++)

        {
            for (j=i+1;j<n;j++)
            {
                if (arr[j]>arr[i])
                    next = arr[j];
                    break;
            }
            res[i] = next;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        int[]res = nextgreater(arr);
        for (int i = 0; i < n; i++)
            System.out.println(res[i]+" ");
    }
 */

/*
public static int sumprime(int n) {
        int i,j;
        int sum = 0;
        boolean isprime = true;
        for (i=2;i<=n;i++)
            for (j=2;j<=Math.sqrt(i);j++)
                if (i%j==0)
                    isprime = false;
                    break;
                if (isprime)
                    sum+=i;
        return sum;
    }
 */