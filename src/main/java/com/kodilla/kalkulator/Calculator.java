package com.kodilla.kalkulator;

public class Calculator {

    public int addAtoB(int a, int b) {
        return a + b;
    }
    public int subtractAfromB(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int results = calculator.addAtoB(5,7);
        System.out.println(results);
    }

}
