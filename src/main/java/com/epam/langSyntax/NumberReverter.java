package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int firstNum=number/100;
        int secNum=number/10-firstNum*10;
        System.out.println(number%10*100+secNum*10+firstNum);
    }

}
