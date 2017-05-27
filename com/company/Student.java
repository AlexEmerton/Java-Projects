package com.company;


public class Student {
    public int getAverage() {
        return 77;
    }


    public static void printDegreeClassification(Student t1) {
        if(t1.getAverage() >= 70){
            System.out.println("First");
        }
        else if (t1.getAverage() >= 60){
            System.out.println("Second");
        }
    }
}