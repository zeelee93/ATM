package lee.zac;

import java.util.ArrayList;

/**
 * Created by zaclee on 9/16/16.
 */
public class BankAccount {

    private double accountBalance;
    private ArrayList<String> accountHistory;
    private Type accountType;
    private Status accountStatus;
    private int bankAccountNumber;
    private String message;

    enum Type { CHECKING, SAVINGS, INVESTMENT;}

    enum Status { OPEN, CLOSED; }

    public BankAccount(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        accountHistory = new ArrayList<String>();
        accountBalance=0;
        accountStatus = Status.OPEN;
    }

    public ArrayList<String> getAccountHistory() {
        return accountHistory;
    }

    public void addToAccountHistory(String str) {
        accountHistory.add(str);
    }

    public void setAccountStatus(Status accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Status getAccountStatus() {
        return accountStatus;
    }

    public void setAccountType(Type type) {
         accountType = type;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }
}
