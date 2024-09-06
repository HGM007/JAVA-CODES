public class zeroatlast {
    public static void func(int []arr){
        int i,j=0;
        int []res = new int[arr.length];
        for (i=0;i< arr.length;i++)
        {
            if (arr[i]!=0)
                res[j++] = arr[i];
        }
        while (j< arr.length)
            res[j++] = 0;
        for (i=0;i< arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr = {2,3,0,5,0};
        func(arr);
    }
}
