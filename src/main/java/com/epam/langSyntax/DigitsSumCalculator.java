package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int firstNum=number/1000;
        int secNum=number/100-firstNum*10;
        int thirdNum=number/10-firstNum*100-secNum*10;
        System.out.println(number%10+thirdNum+secNum+firstNum);
    }

}
