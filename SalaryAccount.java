import java.time.LocalDate;
class SalaryAccount extends Account{
      
    private static final double MIN_BALANCE = 0.0;
    public SalaryAccount(String name,String number, String email, LocalDate creationDate, double balance,AccountType type)
    {
        super(name,number,email,creationDate,balance,type);
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
            System.out.println("You can't withdraw for insufficient balance");
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