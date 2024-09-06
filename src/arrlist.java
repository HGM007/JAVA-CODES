import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.remove(0);
        list.add(0,"10");
//        list.get(0);
        System.out.println(list);
        int n = 5;
        ArrayList<Integer> list1 = new ArrayList<>(n);
        for (int i =0;i<n;i++)
        {
            list1.add(i);
        }
        list1.add(0,10);
        System.out.println(list1);
    }
}
