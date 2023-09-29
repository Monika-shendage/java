package array;

public class thirdlastsmalestarray {
    public static void main(String[] args) {
        int arr[]={10,20,25,40,50,60,70,80};
        int min1=arr[0];
        int min2=arr[1];
        int min3=arr[2];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]>min2 && arr[i]!=min1){
                min2=arr[i];
            }
            else  if (arr[i]>min3 && arr[i]!=min2){
                min3=arr[i];
            }
        }
        System.out.println(min3);
    }
}
