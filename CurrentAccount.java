import java.time.LocalDate;
class CurrentAccount extends Account{
      
    private static final double LIMIT_BALANCE = -2000.0;
    public CurrentAccount(String name,String number, String email, LocalDate creationdate, double balance,AccountType type)
    {
        super(name,number,email,creationdate,balance,type);
    }
    @Override
    public boolean withdraw(double amount)
    {
        if(this.getBalance() - amount>=LIMIT_BALANCE)
        {
            this.setBalance(this.getBalance()-amount);
            return true;
        }
        else
        {
            System.out.println("You can't withdraw for exceeds limit");
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

