public class heap {
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxidx=i;

        if (left<size && arr[left]>arr[maxidx]){
            maxidx=left;
        }
        if (right<size && arr[right]>arr[maxidx]){
            maxidx=right;
        }
        if (maxidx!=i){
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx]=temp;
        }
    }
    public static void heapsort(int arr[]) {
        // step 1:- build maxheap
        int i;
        int n=arr.length;
        for ( i=n/2;i>=0;i--)
        {
            heapify(arr,i,n);
        }
        //step2:- push largest at end
        for (i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
        heapify(arr,0,i);
    }


    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        heapsort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            System.out.println();
        }

    }
}
