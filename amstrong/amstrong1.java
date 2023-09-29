package amstrong;

public class amstrong1 {
    public static void main(String[] args) {
        int a=153;
        int tem=a;
        int sum=0;
        while ((a!=0)){
            int r=a%10;
            sum+=(r*r*r);
            a=a/10;
        }
        if(sum==tem)
            System.out.println("Amstrong Number");
    }
}
