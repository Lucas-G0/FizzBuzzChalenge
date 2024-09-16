package com.challenge.fizzbuzz;

public class Fizz implements Valid{
    public static String retorno = "Fizz";

    @Override
    public boolean isValid(int number) {
        if (number % 3 == 0) {
            return true;
        } else return false;
    }
}
