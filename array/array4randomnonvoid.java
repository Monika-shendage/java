package array;

import java.util.Random;

public class array4randomnonvoid {
    static Random rd=new Random();
    public static int[] randomArr(int n) {
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=rd.nextInt(6);
        }
        return arr;

    }
}
