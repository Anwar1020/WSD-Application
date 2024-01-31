import java.time.LocalDate;


abstract class Account{

    private String name;
    private String number;
    private String email;
    private LocalDate creationdate;
    private double balance;
    private AccountType type;
    

    public Account(String name,String number,String email,LocalDate creationdate, double balance, AccountType type)
    {
        this.name = name;
        this.number = number;
        this.creationdate = creationdate;
        this.balance = balance;
        this.email = email;
        this.type = type;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }



    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number =number;
    }


    public LocalDate getCreationDate()
    {
        return creationdate;
    }
    public void setCreationDate(LocalDate creationdate)
    {
        this.creationdate = creationdate;
    }
    
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }


    public Double getBalance()
    {
        return balance;
    }
    public void setBalance(Double balance)
    {
        this.balance = balance;
    }


    public AccountType getType()
    {
        return type;
    }
    public void setType(AccountType type)
    {
        this.type = type;
    }


    public abstract boolean withdraw(double amount);
    public abstract boolean deposit(double amount);

    public String toString() {
        return "Account Information:" +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nNumber: " + number +
                "\nBalance: " + balance +
                "\nCreation Date: " + creationdate+
                "\nAccount type: "+ type;
    }
    
}