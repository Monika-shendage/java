package array;

public class arrayduplicate {
    public static void main(String[] args) {
        int arr[]={2,2,5,3,7,9,9};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++)

            if(arr[i]==arr[j])
                System.out.println("No is Duplicate "+arr[j]);


        }
    }
}
