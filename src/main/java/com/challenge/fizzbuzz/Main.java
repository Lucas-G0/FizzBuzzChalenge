package com.challenge.fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------------------------\n" +
                "Desafio FizzBuzz (Orientação a Objetos)" +
                "\n------------------------------------\n");

        Scanner sc = new Scanner(System.in); //scanner sc creation

        System.out.println("Type a number:");
        int num = sc.nextInt(); // reading user number

        FizzBuzz challenge = new FizzBuzz(num);
        challenge.exec();

        System.out.println("\n------------------------------------\n" +
                "End" +
                "\n------------------------------------\n");
    }
}