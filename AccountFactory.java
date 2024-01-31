import java.time.LocalDate;
class AccountFactory{
    public static  Account createAccount(AccountType type,String name,String number,String email,LocalDate creationdate, double balance)
    {
     switch (type) {
         case SAVINGS:
              return new SavingsAccount(name,number,email,creationdate,balance,AccountType.SAVINGS);
         case CURRENT:
              return new CurrentAccount(name, number, email, creationdate, balance,AccountType.CURRENT);
         case SALARY:
              return new SalaryAccount(name, number, email, creationdate, balance,AccountType.SALARY);
            
         default:
             throw new IllegalArgumentException("Invalid account type");
             
     }
    }
 }