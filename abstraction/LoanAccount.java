package abstraction;

public class LoanAccount implements Account{
    double loanAmount;

    public LoanAccount(double loanAmount){
        this.loanAmount=loanAmount;
        System.out.println("Loan Account Created");
    }
    @Override
    public void deposit(double amt) {
        loanAmount-=amt;
        System.out.println(amt+"Rs Debited From Loan Account");
    }

    @Override
    public void withdraw(double amt) {
        loanAmount+=amt;
        System.out.println("Rs Credited From Loan Account");
    }

    @Override
    public void checkBalance() {
        System.out.println("Active Loan Amount"+loanAmount);
    }
}

