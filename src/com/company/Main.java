package com.company;

public class Main {

    public static void main(String[] args) {
    //FizzBuzz
        for (int i = 1; i <= 100; i++) {
            String string = "";

            if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else if (i%15 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}
