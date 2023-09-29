package amstrong;

public class amstrong2 {
    public static void main(String[] args) {
        for (int i=10;i<=10000;i++){
           int a=i;
           int temp=a;
           int sum=0;
           int count=0;
           while (temp!=0){
               temp/=10;
               count++;

           }
           while (a !=0){
               int r=a%10;
               sum= (int) (sum+Math.pow(r,count));
               a/=10;
           }
           if(sum==i)
               System.out.println(sum);
        }
    }
}
