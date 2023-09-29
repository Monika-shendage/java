package arrayprogram;

public class StoreManager {
    static String[]products={"TV","PROJECTOR","MOBILE"};
    static double[]cost={1200.25,1540,2000.56};
    static int[]stock={50,30,90};
    void calculateBill(int choice,int qty){
        boolean found=false;
        for(int a=0;a< products.length;a++)
        {
            if(choice==a &&qty<=stock[a])
            {
                double total=qty*cost[a];
                stock[a]-=qty;
                System.out.println("total bill  amount " +" " + total);
                found=true;
            }

        }
        if(!found)
        {
            System.out.println("product not found or out of stock");
        }
    }

}
