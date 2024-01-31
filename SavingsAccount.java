import java.time.LocalDate;

class SavingsAccount extends Account{
      
    private static final double MIN_BALANCE = 2000.0;
    public SavingsAccount(String name,String number, String email, LocalDate creationdate, double balance,AccountType type)
    {
        super(name,number,email,creationdate,balance,type);
    }
    @Override
    public boolean withdraw(double amount)
    {
        if(this.getBalance() - amount>=MIN_BALANCE)
        {
            this.setBalance(this.getBalance()-amount);
            return true;
        }
        else
        {
            System.out.println("Insufficient Balance to withdraw");
            return false;
        }
    }
    @Override
    public boolean deposit(double amount)
    {
        this.setBalance(this.getBalance()+amount);
        return true;
    }
}
