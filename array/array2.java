//Find sum and avg of array
package array;
public class array2 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int sum=0;
        for (int j : arr){
            sum+=j;
        }
        int avg =sum/arr.length;
        System.out.println("Sum of array "+sum);
        System.out.println("Avg of array "+avg);
    }
}
