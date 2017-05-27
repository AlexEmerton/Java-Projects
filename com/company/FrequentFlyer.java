package com.company;

/**
 * Created by Alex on 27-May-17.
 */

public class FrequentFlyer {
    private int accountNumber;
    private int balance;
    private int tier;

    FrequentFlyer(int accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
        tier = 0;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public int getTier(){
        return tier;
    }

    public void addFlight(int miles){
        if(tier == 0){
            balance += miles;
        }
        else {
            balance += (int) (miles * 1.25);
        }
    }

    public void endOfYear(){
        if (balance > 10000){
            tier = 1;
        }
        balance = 0;
    }

    public boolean redeemPoints(int points){
        if (balance >= points){
            balance -= points;
            return true;
        }
        else {
            return false;
        }
    }
}
