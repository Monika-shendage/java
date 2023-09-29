package abstraction;

public class SavingsAccount implements Account {
  double accountBalance;
  public  SavingsAccount(double accountBalance){
      this.accountBalance=accountBalance;
      System.out.println("Saving Account Created");
  }
    @Override
    public void deposit(double amt) {
        accountBalance+=amt;
        System.out.println(amt+"Rs Credited To ypu Account");
    }

    @Override
    public void withdraw(double amt) {
    if(amt<=accountBalance){
        accountBalance-=amt;
        System.out.println(amt+"Rs Debited From Your Account");
    }
    else {
        System.out.println("Insufficient Account Balance");
    }
    }

    @Override
    public void checkBalance() {
        System.out.println("Active Balance"+accountBalance);
    }
}
