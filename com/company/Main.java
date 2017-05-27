package com.company;

import java.util.Arrays;

public class Main {
    public static String weather_type(double speed) {
        String type;
        if (speed <= 17) {
            type = "tropical depression";
        }
        else if (speed > 17 && speed <= 32) {
            type = "tropical storm";
        }
        else if (speed > 32 && speed <= 42) {
            type = "category one hurricane";
        }
        else {
            type = "category two+ hurricane";
        }
        return type;

    }

    public static double sq_mean(double[] data) {
        double sq_sum = 0.0;

        for (int i = 0; i < data.length; i++) {
            sq_sum += data[i] * data[i];
        }
        return Math.sqrt(sq_sum / data.length);
    }

    public static boolean leap_y(int year){
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else if (year % 400 != 0 && year % 100 == 0){
            return false;
        }
        else {
            return true;
        }
    }

    public static String last4(String s) {
        if (s.length() <= 4) {
            return s;
        } else {
            return s.substring(s.length() - 4);
        }
    }

    public static double[] square(double[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] * a[i];
        }
        return a;
    }

    public static double getEuclideanNorm(double[] vec){
        double sum = 0.0;
        for (int i = 0; i < vec.length; i++){
            sum += vec[i] * vec[i];
        }
        return Math.sqrt(sum);
    }

    public static double[] getNormalised(double[] vec){
        double euc = getEuclideanNorm(vec);
        for (int i = 0; i < vec.length; i++){
            vec[i] = vec[i] / euc;
        }
        return vec;
    }

    public static void printWords(String s){
        //int t = 0;
        for (int i = 0; i < s.length(); i++){
            if (!Character.isWhitespace(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
            else {
                System.out.println();
            }
        }
    }

    public static double getMean(double[] vec){
        double mean = 0.0;
        for(int i = 0; i < vec.length; i++){
            mean += vec[i];
        }
        return mean / vec.length;
    }

    public static double getSD(double[] vec){
        double sd = 0.0;
        double mean = getMean(vec);
        for(int i = 0; i < vec.length; i++){
            sd += (vec[i]-mean) * (vec[i]-mean);
        }
        return Math.sqrt(sd / vec.length);
    }

    public static void printBarChart(int data[], String labels[]){
        double highestN = 0;
        int highestL = 0;
        double ratio = 0.0;
        for (int i = 0; i < data.length; i++){
            if (data[i] > highestN) {
                highestN = data[i];
            }
        }
        for (int j = 0; j < labels.length; j++){
            if (labels[j].length() > highestL){
                highestL = labels[j].length();
            }
        }
        ratio = highestN / 40;
        for (int t = 0; t < labels.length; t++){
            for (int k = 0; k < highestL - labels[t].length() ; k++) {
                System.out.print(" ");
            }
            System.out.print(labels[t] + " ");
            for (int p = 0; p < (data[t] / ratio); p++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
    double D[] = {1, 1, 2, 5, 7};
    double A[] = {0, 3, 4};
    double V[] = {2, 4, 4, 4, 7, 9};
    String cities[] = {"Egypt", "France", "Japan", "Switzerland"};
    int data[] = {124, 34, 22, 101};

    printBarChart(data, cities);

    //System.out.println(getSD(V));
    //System.out.println(Arrays.toString(square(D)));
    /*
    OysterCard t1 = new OysterCard("322");
    t1.topUp(2.10);
    //System.out.println(t1.getCardNumber());
    //System.out.println(t1.getBalance());
    t1.touch(1);
    t1.touch(1);
    System.out.println(t1.getBalance());

    System.out.println(leap_y(2016));
    System.out.println(leap_y(2000));
    System.out.println(leap_y(2100));
    */

    //System.out.println(getEuclideanNorm(A));
    //System.out.println(Arrays.toString(getNormalised(A)));
    //String sentence = "Alex is at home";
    //printWords(sentence);

    /*
    LoyaltyCard t1 = new LoyaltyCard("5544");
    System.out.println(t1.getBalance());
    //System.out.println(t1.getCardNumber());
    t1.collectRewards(10.50, 3);
    System.out.println(t1.getBalance());
    t1.collectRewards(18.00, 6);
    System.out.println(t1.getBalance());
    System.out.println(t1.coffees());
    t1.redeemFreeCoffee();
    System.out.println(t1.coffees());
    */


}


}
