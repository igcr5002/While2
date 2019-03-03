package com.company;

public class Main {

    public static void main(String[] args) {

        //Challenge

        int number=4;
        int finishNumbner=20;
        int count =0;
        while (number <=finishNumbner){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count==6) {
                break;
            }
        }
        System.out.println("Total of even numbers = "+count);

    }

    private static boolean isEvenNumber(int parameter) {

        if(parameter % 2 == 0) return true;
        return false;

    }

}
