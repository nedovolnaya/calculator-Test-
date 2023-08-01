package skypro.calculatorTest.service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import skypro.calculatorTest.service.CalculatorService;
import skypro.calculatorTest.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForTestPlus")
    @ParameterizedTest
    public void ParamTestPlus(int num1, int num2, int expected) {
        int result = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgumentsForTestPlus() {
        return Stream.of(
                Arguments.of(10, 10, 20),
                Arguments.of(20, 20, 40),
                Arguments.of(40, 40, 80),
                Arguments.of(80, 80, 160)
        );
    }

    @MethodSource("provideArgumentsForTestMinus")
    @ParameterizedTest
    public void ParamTestMinus(int num1, int num2, int expected) {
        int result = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgumentsForTestMinus() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(20, 10, 10),
                Arguments.of(50, 25, 25),
                Arguments.of(100, 10, 90)
        );
    }

    @MethodSource("provideArgumentsForTestMultiply")
    @ParameterizedTest
    public void paramTestMultiply(int num1, int num2, int expected) {
        int result = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgumentsForTestMultiply() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(10, 10, 100),
                Arguments.of(2, 2, 4),
                Arguments.of(6, 6, 36)
        );
    }

    @MethodSource("provideArgumentsForTestDivide")
    @ParameterizedTest
    public void paramTestDivide(int num1, int num2, int expected) {
        int result = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideArgumentsForTestDivide() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(20, 4, 5),
                Arguments.of(100, 2, 50),
                Arguments.of(100, 4, 25)
        );
    }
}
