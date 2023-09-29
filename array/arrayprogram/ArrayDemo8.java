package arrayprogram;
import java.util.Scanner;
public class ArrayDemo8 {


        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            boolean status=true;
            while (status){
                System.out.println("select Products");
                System.out.println("0:tv\n1:projector\n2:mobile\n3:exit");
                int choice=sc.nextInt();
                System.out.println("enter qty");
                int qty= sc.nextInt();
                StoreManager s1=new StoreManager();
                if(choice==0||choice==1||choice==2){
                    s1.calculateBill(choice ,qty);
                }
                else {
                    System.out.println("invalid choice");
                    status=false;
                }
            }
        }
    }
