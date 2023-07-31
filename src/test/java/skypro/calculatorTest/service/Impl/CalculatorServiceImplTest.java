package skypro.calculatorTest.service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import skypro.calculatorTest.exception.ZeroDividerException;
import skypro.calculatorTest.service.CalculatorService;
import skypro.calculatorTest.service.impl.CalculatorServiceImpl;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testPlus() {
        int result = calculatorService.plus(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testMinus() {
        int result = calculatorService.minus(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testDivide() {
        int result = calculatorService.divide(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(ZeroDividerException.class, () -> calculatorService.divide(5, 0));
    }
}
