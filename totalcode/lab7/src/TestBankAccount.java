public class TestBankAccount {
    
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("Mary Bloggs", 500);
        BankAccount ac2 = new BankAccount("Joe Spot", 1000);

        System.out.println("Balance is "+ac1.getBalance());
        ac2.print();
        ac2.deposit(500);
        ac2.print();
        ac1.print();
        ac1.withdrawal(600);
        ac1.withdrawal(400);
        ac1.setName("Mary Bloggs-Spot");
        ac1.print();
    }

}

class BankAccount{
    private String name;
    private double balance;
    private  static int lastaccountID=1;
    private int accountID=100000;
    
    public BankAccount() {
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        accountID+=lastaccountID;
        lastaccountID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public int getaccountID() {
        return accountID;
    }

    public void deposit(double d) {
        balance+=d;
    }
    public void withdrawal(double w) {
        if (w>balance)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            balance-=w;
        }
    }
    public void print() {
        System.out.println("******************");
        System.out.println("Name: "+getName());
        System.out.println("Balance "+getBalance());
        System.out.println("Account ID:"+getaccountID());
        System.out.println("******************");

    }
}