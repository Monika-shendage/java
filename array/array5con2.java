package array;
//wrong program
import java.util.Arrays;

public class array5con2 {
    public static void main(String[] args) {
        int arr1[] =new int  []{1, 2, 3, 4 };
        int arr2[] = new int []{ 5,6, 7, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        int idx=1;
        for (int a: arr1) {
            arr3[idx]=a;
            idx+=2;
        }

        for (int a:arr2){
            arr3[idx]=a;
            idx+=2;
        }
        System.out.println(Arrays.toString(arr3));
    }
}

