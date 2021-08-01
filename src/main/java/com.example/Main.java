package com.example;

import org.apache.commons.math3.primes.Primes;

public class Main {
    public static void main(String[] args) {
        for (String line : args) {
            try {
                if (Primes.isPrime(Integer.parseInt(line))) {
                    System.out.println(line + " - prime");
                } else {
                    System.out.println(line + " - not prime");
                }
            } catch (NumberFormatException ex) {
                System.out.println(line + " - NOT A NUMBER");
            }
        }
    }
}
