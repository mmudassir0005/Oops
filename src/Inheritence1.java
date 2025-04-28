class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob)
    {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }

    public void setAddress(String add)
    {
        address = add;
    }

    public void setPhno(String phno)
    {
        this.phno = phno;
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt)
    {
        balance += amt;
    }

    public void withdraw(long amt)
    {
        balance -= amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt)
    {
        balance -= amt;
    }

    public void repay(long amt)
    {
        if(balance == amt)
            balance = 0;
    }
}

public class Inheritence1
{
    public static void main(String[] args)
    {
        // Creating a SavingsAccount object
        SavingsAccount sa = new SavingsAccount("SA123", "John Doe", "123 Main St", "9876543210", "01-01-1990");
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Savings Account Balance: " + sa.getBalance());

        // Creating a LoanAccount object
        LoanAccount la = new LoanAccount("LA456", "Jane Smith", "456 Market St", "8765432109", "02-02-1985");
        la.payEMI(1000);
        la.repay(0);
        System.out.println("Loan Account Balance: " + la.getBalance());
    }
}
