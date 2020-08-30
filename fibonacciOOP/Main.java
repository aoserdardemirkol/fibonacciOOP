package com.fibonacciOOP;

public class Main {
    public static void main(String[] args) {
        // Main method
        fibo sayi = new fibo(10000);
        sayi.fibonacci();
        System.out.print(sayi.toString());
    }
}
