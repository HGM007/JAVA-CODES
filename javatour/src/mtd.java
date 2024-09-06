public class mtd {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
//        x = 566;
        return z;
    }
    static void change(int aa){
        aa=98;
    }
    static void change1(int []arr){
        arr[0]=50;
//        arr is refrance
    }
    public static void main(String[] args) {
//        DRY :- dont repeat yourself princeple
        int a =5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(a+" "+b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
        int aaa=5;
        change(aaa);
        System.out.println("change done to " + aaa);
        int []arr={55,66,77,88,99};
        change1(arr);
        System.out.println(arr[0]);
//        it will print 50 because we have passed reference not the object of arr
        }


}
