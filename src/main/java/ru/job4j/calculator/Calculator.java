package ru.job4j.calculator;

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }
    public static void main(String[] args){
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = Calculator.plus(six, two);
        int fiveMinusTwo = Calculator.plus(five, two);
        int fourTimeTwo = Calculator.plus(four, two);
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);


    }
}
