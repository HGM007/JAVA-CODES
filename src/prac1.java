public class prac1 {
    // next great num print or -1
    public static void nextgreaterelem(int []arr){
        int i,j;
        int []res = new int[arr.length];
        for (i=0;i< arr.length;i++)
        {
            res[i] = -1;
            for (j=i;j< arr.length;j++)
            {
                if (arr[i]<arr[j])
                    res[i]=arr[j];
                    break;
            }
            for (i=0;i< arr.length;i++)
            {
                System.out.println(res[i]+" ");
            }
        }
    }
    // non zero elem first then zero elem
    public static void zerolast(int[]arr) {
        int i,j=0;
        int [] res = new int[arr.length];

        for (i=0;i< arr.length;i++)
        {
            if (arr[i]!=0)
                res[j++]=arr[i];
        }
        while (j< arr.length)
            res[j++]=0;
        for (i=0;i< arr.length;i++)
            System.out.println(res[i]);
    }
    public static int contiguous_sum_of_subarray(int []arr){
        int sumarr = arr[0];
        int maxsum = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            sumarr = Math.max(arr[i],sumarr+arr[i]);
            maxsum = Math.max(maxsum,sumarr);
        }
        return maxsum;
    }
    public static void 
}
