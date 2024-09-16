package com.challenge.fizzbuzz;

public class Buzz implements Valid{
    public static String retorno = "Buzz";

    @Override
    public boolean isValid(int number) {
        if (number % 5 == 0) {
            return true;
        } else return false;
    }
}
