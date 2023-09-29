package array;

import java.util.Scanner;

public class arrayindex {
    public static void main(String[] args) {
        int [] arr={1,20,30,40,50};
        for (int a:arr)
            System.out.print(a+" ");
        int n=new Scanner(System.in).nextInt();
        for (int i=0;i<arr.length;i++)
            if(arr[i]==n)
                System.out.println("Index"+i);
    }
}
