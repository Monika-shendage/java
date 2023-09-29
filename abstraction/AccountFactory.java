package abstraction;

public class AccountFactory {
    Account createAccount (int type ,double balance){
        Account a1=null;
        if(type==1){
            a1=new SavingsAccount(balance); //upcasting
        }
        else if(type==2){
            a1=new LoanAccount(balance); //upcasting
        }
        return a1;
    }
}
