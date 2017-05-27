package com.company;

public class LoyaltyCard {
    private String card_number;
    private int n_of_coffees;
    private int balance;

    LoyaltyCard(String card_number){
        this.card_number = card_number;
        n_of_coffees = 0;
        balance = 0;
    }

    public String getCardNumber(){
        return card_number;
    }

    public int getBalance(){
        return balance;
    }
    public int coffees(){
        return n_of_coffees;
    }

    public void collectRewards(double amount, int coffees){
        balance += (int)amount;
        n_of_coffees += coffees;
    }

    public boolean isFreeCoffeeAvailable(){
        return n_of_coffees >= 9;
    }

    public boolean redeemFreeCoffee(){
        if(isFreeCoffeeAvailable()){
            n_of_coffees -= 9;
            return true;
        }
        else{
            return false;
        }
    }
}
