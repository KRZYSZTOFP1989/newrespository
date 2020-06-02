package com.kodilla.kalkulator;

public class Calculator {

    public int AddAtoB(int a, int b) {
        return a + b;
    }
    public int subtractAfromB(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int results = calculator.AddAtoB(5,7);
        System.out.println(results);
    }

}
