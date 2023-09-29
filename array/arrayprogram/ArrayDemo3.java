/*Enter Total Courses
3
Enter Courses Name
html
css
java
Selected Courses
html
css
java*/

package arrayprogram;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Total Courses");
        int size= sc1.nextInt();
        String[] courses =new String[size];
        System.out.println("Enter Courses Name");
        for (int a=0;a<size;a++){
            courses[a]=sc1.next();
        }
        System.out.println("Selected Courses");
        for (int a=0;a<size;a++){
            System.out.println(courses[a]);
        }
    }

}
