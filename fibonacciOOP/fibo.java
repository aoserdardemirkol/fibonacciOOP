package com.fibonacciOOP;

import java.math.BigInteger;

public class fibo {
    private int deger;
    private BigInteger result;

    public fibo(int deger) {
        this.deger = deger;
    }

    public void fibonacci() {
        BigInteger mod = BigInteger.valueOf(1000000);

        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger third;
        for (int i = 2; i <= deger; i++) {
            third = first.add(second);
            first = second;
            second = third;
        }

        this.result = first.mod(mod);
    }

    public int getdeger() {
        return deger;
    }

    public void setdeger(int deger) {
        this.deger = deger;
    }

    public String toString() {
        return deger + " sayısının fibonacci değerinin son 6 hanesi: " + result;
    }
}