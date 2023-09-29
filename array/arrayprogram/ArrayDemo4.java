/*Enter total no of courses
3
Enter Marks
63
96
85
244.0
81.33333333333333*/
package arrayprogram;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter total no of courses");
        int size=sc1.nextInt();

        double[] marks= new double[size];
        double sum=0.0;
        double percentage=0.0;
        System.out.println("Enter Marks");
        for(int a=0;a<size;a++){
            marks[a]= sc1.nextDouble();
            sum += marks[a];
           percentage =sum/size;

        }
        System.out.println(sum);
        System.out.println(percentage);
    }
}
