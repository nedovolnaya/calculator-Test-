package skypro.calculatorTest.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    public int plus(int num1, int num2);

    public int minus(int num1, int num2);

    public int multiply(int num1, int num2);

    public int divide(int num1, int num2);
}
