package org.iesfm.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CalculatorMenu menu = new CalculatorMenu(
                new Scanner(System.in),
                new Calculator()
        );
        menu.run();
    }
}