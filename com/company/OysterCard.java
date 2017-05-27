package com.company;

public class OysterCard{
    private String card_number;
    private double balance;
    private int touchInZone = 0;

    OysterCard(String card_number) {
        this.card_number = card_number;
        this.balance = 0;
    }

    public String getCardNumber() {
        return card_number;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean topUp(double amount) {
        if (amount > 0){
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean touch(int zone){

        if (touchInZone == 0){
            if (balance < 2.10) {
                return false;
            } else {
                touchInZone = zone;
                return true;
            }
        } else {
            if (touchInZone == 1) {
                balance -= 2.10;
            } else if (touchInZone == 2 && zone == 1){
                balance -= 2.10;
            } else {
                balance -= 1.50;
            }
            touchInZone = 0;
            return true;
        }
    }
}

