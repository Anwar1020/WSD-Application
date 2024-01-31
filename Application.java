import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


 

public class Application{
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
      boolean exit = false;
      while(!exit)
      {
        displayMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                 displayAccount();
                 break;
            case 3:
                 updateAccount();
                 break;
            case 4:
                 deleteAccount();
                 break;
            case 5:
                 depositAmount();
                 break;
                
            case 6:
                 withdrawAmount();
                 break;
            case 7:
                searchforAccount();
                break;
            case 8:
                 exit = true;
                 break;
        
            default:
                break;
        }

      }
    }


    private static void  displayMenu()
    {
        System.out.println("1. Create new account");
        System.out.println("2. Display all account");
        System.out.println("3. Update an account");
        System.out.println("4. Delete account");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Search for account");
        System.out.println("8. exit");
        System.out.println("Enter your choice");
    }
     //display some -----
     private static void displaydot()
     {
        System.out.println("---------------------------------------");
     }



//create account
    private static void createAccount()
    {

        displaydot();
        //input name
        System.out.println("Enter Account Name: ");
        String name = scanner.nextLine();


        //input email
        String email;
        while(true)
        {
            System.out.println("Enter your email: ");
            email = scanner.nextLine();
            int cnt = 0;
            for(int i=0;i<email.length();i++)
            {
                if(email.charAt(i)=='@')
                cnt++;
            }
            if(cnt>1 || cnt==0)
            {
                System.out.println("email is not correct , please enter email again");
                
            }
            else
                break;
        }


        //input number
        String number;
        while(true)
        {
            System.out.println("Enter number: ");
            number = scanner.nextLine().trim();
            try {
                Long.parseLong(number);


                int flag = 0;
                for(Account account:accounts)
                {
                    if(account.getNumber().equals(number))
                    {
                        System.out.println("Number already exist");
                        flag = 1;
                        break;
                    }
                }


                if(flag==1)continue;
                else
                break;
            }
            catch (Exception e) {
            System.out.println("This is not number , please enter again");
            
           }
        }
        



        //input initial balance
        double balance=0.0;
        while(true)
        {
            System.out.println("Enter you initial balance ");
            String blnce = scanner.nextLine();
            balance=0.0;

            try{
                balance = Double.parseDouble(blnce);
                break;

            }
            catch (Exception e)
            {
                System.out.println("It is not double number,please enter a valid number");
                
            }
        }
        



        LocalDate creationdate = LocalDate.now();

        System.out.println("Enter account type: ");
        System.out.println("1. Savings ");
        System.out.println("2. Current ");
        System.out.println("3. Salary ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        AccountType type;
        if(choice == 1)
        {
            type = AccountType.SAVINGS;
        }
        else if(choice == 2)
        {
            type = AccountType.CURRENT;
        }
        else
        type = AccountType.SALARY;
            
        Account account = AccountFactory.createAccount(type, name, number, email, creationdate, balance);
        accounts.add(account);

        System.out.println("Account created successfully ");
        displaydot();
        return ;
       
    }

   //display all account

    private static void displayAccount()
    {
        for(Account account : accounts)
        {
            displaydot();
            System.out.println(account);
            displaydot();
        }
    }

   //update account

   private static void updateAccount()
   {
    displaydot();
     System.out.println("Enter account number: ");
     String number = scanner.nextLine();
     for(Account account:accounts)
     {
        if(account.getNumber().equals(number))
        {
            System.out.println("Enter amount for updated balance: ");
            double amount  = scanner.nextDouble();
            scanner.nextLine();
            account.setBalance(amount);
            System.out.println(" Successfully updated your account ");
            displaydot();
            return;
            
        }
        
            
     }

     System.out.println("There is no account of this number");
     displaydot();
     return ;


   }

   //delete account

   public static void deleteAccount()
   {
     displaydot();
      System.out.println("Enter your number which want to delete ");
      String number = scanner.nextLine();
      for(Account account: accounts)
      {
        if(account.getNumber().equals(number))
        {
            accounts.remove(account);
            System.out.println("Successfully deleted your account");
            displaydot();
            return;
        }
        
      }

      System.out.println("There is no account of this number");
      displaydot();
      return ;
     
   }

   //Deposite into your account

   public static void depositAmount()
   {
    displaydot();
     System.out.println("Enter your number");
     String number = scanner.nextLine();
     for(Account account: accounts)
     {
        if(account.getNumber().equals(number))
        {
            System.out.println("Enter Your amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.deposit(amount);
            System.out.println("Successfully deposited");
            System.out.println("New balance is "+ account.getBalance());
            displaydot();
            return ;
        }
     }
     System.out.println("There is no account");
     displaydot();
     return ;
   }


   //withdraw ammount
   public static void withdrawAmount()
   {
    displaydot();
    System.out.println("Enter your number");
     String number = scanner.nextLine();
     for(Account account: accounts)
     {
        if(account.getNumber().equals(number))
        {
            System.out.println("Enter Your amount to withdraw");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.withdraw(amount);
    
            System.out.println("balance is "+ account.getBalance());
            displaydot();
            return ;
        }
     }
     System.out.println("There is no account");
     displaydot();
     return ;
   }


   //search for account
   private static void searchforAccount()
   {
    displaydot();
    System.out.println("Enter your number");
    String number = scanner.nextLine();
    for(Account account: accounts)
    {
       if(account.getNumber().equals(number))
       {
        displaydot();
           System.out.println("Here is your account: ");
           System.out.println("name: "+ account.getName());
           System.out.println("Number: "+ account.getNumber());
           System.out.println("Creation Date: "+ account.getCreationDate());
           System.out.println("balance: "+ account.getBalance());
           System.out.println("Account Type: "+ account.getType());
           displaydot();
           return ;
       }
    }
    System.out.println("There is no account");
    displaydot();
    return ;
   }


}




