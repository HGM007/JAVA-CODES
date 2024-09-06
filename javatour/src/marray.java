/*public class marray {
    public static void main(String[] args) {
        int [] marks; //1 d array
        int [][] flats; // 2d array
        flats = new int [2][3];// 2 roes and 3 colm
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        // i is for row and j is for column
        for(int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
*/

// practise set
//sum of float array
/*public class marray {
    public static void main(String[] args) {
        float [] marks={33.6f,63.5f,98.7f,90.3f};
        float sum =0;
        for (float elem:marks){
            sum=sum+elem;
        }
        System.out.println(sum);
    }
}*/
// find a no. is in array or not
/*public class marray {
    public static void main(String[] args) {
        float [] marks={33.6f,63.5f,98.7f,90.3f};
        float num =98.7f;
        boolean isInArray=false;
        for (float elem:marks){
            if (num==elem){
                isInArray=true;
                break;
            }

        }
        if (isInArray){
            System.out.println("val present in arr");
        }
        else {
            System.out.println("n/a");
        }
    }
}*/
// java prog to print 2x3 array

/*public class marray {
    public static void main(String[] args) {
        int[][]mat1 ={{1,2,3},
                    {4,5,6}};
        int[][]mat2 ={{2,3,4},
                    {9,4,7}};
        int[][]res = {{0,0,0},
                    {0,0,0}};

        for (int i=0;i< mat1.length;i++) //row no. of time
        {
            for (int j=0;j< mat1[i].length;j++) // colm no. of time
            {
                res[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}*/

public class marray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}