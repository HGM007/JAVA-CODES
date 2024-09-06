import java.util.*;
public class HeapInsert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par =(x-1)/2;
            while(arr.get(x)<arr.get(par))
            {
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i){
            int l = 2*i+1;
            int r = 2*i+2;
            int minidx = i;

            if (l<arr.size() && arr.get(l)<arr.get(minidx))
            {
                minidx=l;
            }
            if (r<arr.size() && arr.get(r)<arr.get(minidx))
            {
                minidx=r;
            }
            if (minidx!=i)
            {
                int temp =arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }
        }

        public int remove(){
            int data = arr.get(0);
//            step 1
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
//            step 2
            arr.remove(arr.size()-1);
//            step 3
            heapify(0);
            return 0;

        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(4);
        h.add(2);
        h.add(7);
        h.add(3);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
