public class CheckingAccount
{
    private double balance;
    private String accountNumber;

    CheckingAccount(String accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    CheckingAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double deposit) throws InsufficientFundsException
    {
        if( deposit>0 )
        {
            this.balance += deposit;
        }
        else
        {
            throw new InsufficientFundsException("Deposit amount must be greater than zero!");
        }
    }

    public void withdraw(double withdrawal) throws InsufficientFundsException
    {
        if(withdrawal >0 )
        {
            if(withdrawal > this.balance)
            {
                throw new InsufficientFundsException("Withdrawal amount exceeds current balance.");
            }
            else
            {
                this.balance -= withdrawal;
            }
        }
        else
        {
            throw new InsufficientFundsException("Withdrawal amount must be greater than zero!");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getNumber()
    {
        return this.accountNumber;
    }
}
