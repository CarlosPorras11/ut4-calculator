package org.iesfm.calculator;

public class Calculator {

    public double divide(Integer n1, Integer n2) throws DivideByZeroException {
        if (n2 == 0) {
            throw new DivideByZeroException();
        }
        return n1 / n2;
    }

    public double average(double[] numbers) throws EmptyArrayException {
        if (numbers.length == 0) {
            throw new EmptyArrayException();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}