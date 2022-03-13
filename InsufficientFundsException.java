import java.io.*;

public class InsufficientFundsException extends Exception {
    private String error;

    InsufficientFundsException(String err)
    {
        super(err);
        this.error = err;
    }
    
    @Override
    public String toString()
    {
        return "java.lang.InsufficientFundsException: " + this.error;
    }
}
