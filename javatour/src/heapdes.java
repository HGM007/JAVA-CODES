public class heapdes {
    public static void heapify(int arr[],int i, int size) {
        int left=2*i+1;
        int right=2*i+2;
        int minindx=i;

        if (left<size && arr[left]<arr[minindx])
        {
            minindx=left;
        }
        if (right<size && arr[right]<arr[minindx])
        {
            minindx=right;
        }
        if (minindx!=i)
        {
            int temp = arr[i];
            arr[i]=arr[minindx];
            arr[minindx]=temp;

            heapify(arr,minindx,size);
        }

    }

    public static void heapsort(int arr[]) {
        int i;
        int n=arr.length;
        for (i=n/2;i>=0;i--)
        {
            heapify(arr,i,n);
        }
        for (i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,2,4,5,7};
        heapsort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}
