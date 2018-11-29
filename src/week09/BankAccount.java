package week09;

/**
 * Created by u1874295 on 29/11/2018.
 */
public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit (double amount) {
        //returns true or not if the deposit was successful
        //for it to be true the amount must be bigger than zero
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw (double amount) {
        //returns true or not if the withdraw was successful
        //for it to be true the amount must be bigger than zero
        //also stops withdraw if the balance or they dont have an overdraft
        if (amount > 0) {
            if ((getBalance()-amount>=0) || (isHasOverdraft())) {
                this.balance -= amount;
            }
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addInterest (int interestRate) {
        //returns true or not if the interest increase is successful
        //for it to be true the interest rate must be bigger than zero
        //and the balance must be over zero
        if ((interestRate>0)&&(this.balance>0)){
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }

    public static void main (String[] args) {

        BankAccount b = new BankAccount ("78325616", "Richard Branson", false);

    }
}