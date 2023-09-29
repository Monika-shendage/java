package array;

import java.util.Arrays;
import java.util.Random;

public class arraylargestno {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};


        int max=arr[0];
        for (int i=0; i<arr.length;i++)
         //we can find largest no using two method normal for loop or nested loop
        //for (int a:arr)
        {
            //if(a>max)
               // max=a;
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
