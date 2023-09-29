/*
Write a Java program to test if an array contains a specific value.
Enter Numbers
38
No Exit*/

package arrayprogram;
import java.util.Scanner;
public class ArrayDemo6 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int no=sc1.nextInt();
        int[] arr={14,26,38};
        boolean found=false;
        for (int a=0;a<arr.length;a++){
            if(no==arr[a]){
                System.out.println("No Exit");
                found =true;
            }
        }if (!found)
        System.out.println("No Does Not Exit");
    }
}
