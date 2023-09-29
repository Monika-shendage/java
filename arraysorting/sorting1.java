
package arraysorting;



public class sorting1 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 2, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)  //we  take -1 bcz of array indexoutofbound

            {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
                    for (int a : arr) {
                        System.out.print(a);
                    }
                }
            }

