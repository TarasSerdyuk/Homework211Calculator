package com.example.homework2_11calculator.servicetest;

import com.example.homework2_11calculator.service.CalculatorService;
import com.example.homework2_11calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("argumentsForSumTest")
    public void shouldReturnSum(int num1, int num2, int expected) {
        int result = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsForSumTest() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(21, 2, 23),
                Arguments.of(73, 1, 74)
        );
    }

    @ParameterizedTest
    @CsvSource({"99,1,98", "11,6,5", "8,8,0"})
    public void shouldReturnMinus(int num1, int num2, int expected) {
        int result = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"2,2,4", "10,1,10", "3,0,0"})
    public void shouldReturnMultiply(int num1, int num2, int expected) {
        int result = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("argumentsForDivision")
    public void shouldReturnDivide(int num1, int num2, int expected) {
        int result = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsForDivision() {
        return Stream.of(
                Arguments.of(10,5,2),
                Arguments.of(4,2,2),
                Arguments.of(100,10,10),
                Arguments.of(9,-3,-3)
        );
    }

}