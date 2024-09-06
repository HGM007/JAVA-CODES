public class nextgreatnum {
    public static void func(int []arr){
        int i,j;
        int []res = new int[arr.length];
        for (i=0;i< arr.length;i++) {
            res[i] = -1;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    res[i] = arr[j];
                break;
            }
        }
        for (i=0;i< arr.length;i++)
        {
            System.out.println(res[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr = {2,25,1,7};
        func(arr);
    }
}
