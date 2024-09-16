package com.challenge.fizzbuzz;

public class FizzBuzz implements Valid {
    public String retorno = "FizzBuzz";
    private int max;
    private Fizz fizz;
    private Buzz buzz;

    public FizzBuzz(int number) {
        this.max = number;
        this.fizz = new Fizz();
        this.buzz = new Buzz();
    }

    public void exec() {
        for (int i = 1; i <= this.max; i++) {
            if (this.isValid(i)) {

                System.out.println(this.retorno);

            } else if (fizz.isValid(i)) {

                System.out.println(fizz.retorno);

            } else if (buzz.isValid(i)) {

                System.out.println(buzz.retorno);

            } else System.out.println(i);
        }
    }

    @Override
    public boolean isValid(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return true;
        } else return false;
    }

}
