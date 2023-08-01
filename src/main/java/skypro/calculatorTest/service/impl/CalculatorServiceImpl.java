package skypro.calculatorTest.service.impl;

import skypro.calculatorTest.exception.ZeroDividerException;
import skypro.calculatorTest.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDividerException();
        }
        return num1 / num2;
    }
}
