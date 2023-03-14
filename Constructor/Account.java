public class Account {
    private String nameOfDeposit;
    private int accountNumber;
    private boolean isSavingsAccount;
    private double balanceAmount;

    public Account(String nameOfDeposit, int accountNumber, boolean isSavingsAccount, double balanceAmount) {
        this.nameOfDeposit = nameOfDeposit;
        this.accountNumber = accountNumber;
        this.isSavingsAccount = isSavingsAccount;
        this.balanceAmount = balanceAmount;
    }

    public String getNameOfDeposit() {
        return nameOfDeposit;
    }

    public void setNameOfDeposit(String nameOfDeposit) {
        this.nameOfDeposit = nameOfDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isSavingsAccount() {
        return isSavingsAccount;
    }

    public void setSavingsAccount(boolean isSavingsAccount) {
        this.isSavingsAccount = isSavingsAccount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public static void main(String[] args) {
        // create a savings account with an initial balance of $1000
        Account savingsAccount = new Account("John Doe", 123456, true, 1000.0);

        // print the account's properties
        System.out.println("Account Name: " + savingsAccount.getNameOfDeposit());
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Account Type: " + (savingsAccount.isSavingsAccount() ? "Savings" : "Checking"));
        System.out.println("Account Balance: $" + savingsAccount.getBalanceAmount());

        // deposit $500 into the savings account
        savingsAccount.setBalanceAmount(savingsAccount.getBalanceAmount() + 500.0);
        System.out.println("New Account Balance: $" + savingsAccount.getBalanceAmount());

        // create a checking account with an initial balance of $500
        Account checkingAccount = new Account("Jane Smith", 789012, false, 500.0);

        // print the account's properties
        System.out.println("Account Name: " + checkingAccount.getNameOfDeposit());
        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Account Type: " + (checkingAccount.isSavingsAccount() ? "Savings" : "Checking"));
        System.out.println("Account Balance: $" + checkingAccount.getBalanceAmount());

        // withdraw $200 from the checking account
        checkingAccount.setBalanceAmount(checkingAccount.getBalanceAmount() - 200.0);
        System.out.println("New Account Balance: $" + checkingAccount.getBalanceAmount());
    }
}
