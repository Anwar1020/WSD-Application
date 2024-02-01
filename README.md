# WSD-Console Application


## README

### Description
This Java console application allows users to manage accounts with functionalities such as creating new accounts, displaying all accounts, updating account details, deleting accounts, depositing money, withdrawing money, and searching for accounts.

### Installation
To compile and run the application, follow these steps:

1. Install Java Development Kit (JDK) on your system if you haven't already done so.
2. Download or clone the Java files provided in this repository.
3. Open your terminal or command prompt.
4. Navigate to the directory where you have saved the Java files.

### Compilation
Compile the Java files in the following order:

```bash
javac Enum.java
javac Account.java
javac CurrentAccount.java
javac SavingsAccount.java
javac SalaryAccount.java
javac AccountFactory.java
javac Application.java
```
After compiling the Java files, run the application by executing the following command:
```bash
java Application
```


### Usage
Once the application is running, you will be presented with a menu containing options numbered from 1 to 8. Here's a short explanation of each option:

1. **Create new account**: Enter details such as name, email, number (unique), initial balance and account type to create 
     a new account. email,number,balance will be checked it is valid or not. Here number is unique you can try by your phone number.
2. **Display all accounts**: View details of all existing accounts.
3. **Update an account**: Modify the details or balance of an existing account. here no validation checked.So please 
    enter correct  input.
4. **Delete account**: Remove an account from the system. Please enter a number for number.Otherwise it will not work.
5. **Deposit**: Add money to an existing account. Please enter a number for number.Otherwise it will not work.
6. **Withdraw**: Withdraw money from an existing account. Please enter a number for number.Otherwise it will not work.
7. **Search for account**: Find and display details of a specific account.Please enter a number for number.Otherwise 
     it will not  work.
8. **Exit**: Quit the application.

Follow the prompts and enter the corresponding number to perform the desired action.

### Notes
- Always try to give input data correctly.

### Contributors
- [Anowar Hossain]

### Support
For any issues or inquiries, please contact [anwarhossan800@gmail.com].


