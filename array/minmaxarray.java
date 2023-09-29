package array;

import java.util.Arrays;

public class minmaxarray {
    public static void main(String[] args) {
        int a[]={65,80,10,20,30,40,50};
        Arrays.sort(a);
        System.out.println("Min = "+a[0]+" Max = "+a[a.length-1]);
        //System.out.println("Max ="+a[a.length-1]);
    }
}
