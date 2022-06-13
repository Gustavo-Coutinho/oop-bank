
public abstract class Account {

    protected double balance;
    private int branchId;
    private int accountId;
    private Client accountOwner;
    private static int accountsCreated = 0;

    public Account() {
    	
    }
    
    public Account(int branchId, int accountId){
        Account.accountsCreated = Account.accountsCreated + 1;
        System.out.println("O accountsCreated de contas é " + Account.accountsCreated);
        this.branchId = branchId;
        this.accountId = accountId;
    }

    public abstract void deposit(double amount);

    public boolean withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double amount, Account destination) {
        if(this.withdraw(amount)) {
                destination.deposit(amount);
                return true;
        } else {
                return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public void setAccountId(int accountId){
        if(accountId <= 0) {
            System.out.println("Nao pode amount menor igual a 0");
            return;
        }
        this.accountId = accountId;
    }

    public int getBranchId(){
        return this.branchId;
    }

    public void setBranchId(int branchId){
       if(branchId <= 0) {
           System.out.println("Nao pode amount menor igual a 0");
           return;
       }
       this.branchId = branchId;
    }

    public void setAccountOwner(Client accountOwner){
        this.accountOwner = accountOwner;
    }

    public Client getOwner(){
        return this.accountOwner;
    }

    public static int getAccountsCreated(){
        return Account.accountsCreated;
    }

}