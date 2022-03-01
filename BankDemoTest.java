import java.util.*;

public class BankDemoTest
{
    public static void main(String[] args)
    {
        CheckingAccount currentAccount = new CheckingAccount("ABC");
        double deposit=0, withdrawal=0;
        try
        {
            Scanner input = new Scanner(System.in);

            //a. Deposit $xx into the account object using keyboard input.
            System.out.println("Please enter amount to deposit into your account : ");
            deposit = input.nextDouble();
            currentAccount.deposit(deposit);

            //b. Withdraw $yy amount from the account object using keyboard input.
            System.out.println("Please enter amount to withdraw from your account : ");
            withdrawal = input.nextDouble();
            currentAccount.withdraw(withdrawal);

            //c. If $yy < $xx, print out the account balance “The balance after withdraw is: $""
            System.out.println("The balance after withdraw is: $" + String.format("%.2f", currentAccount.getBalance()) );
        }
        catch(Exception e)
        {
            //d. If $yy > $xx, print the user-defined exception and short amount “Sorry, but your account is short by: $""
            System.out.println(e);
            System.out.println("Sorry, but your account is short by: $" + String.format("%.2f", withdrawal - currentAccount.getBalance()) );
        }
    }
}

// javac InsufficientFundsException.java CheckingAccount.java BankDemoTest.java
// java  BankDemoTest