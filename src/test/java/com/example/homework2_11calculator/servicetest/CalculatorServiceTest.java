package com.example.homework2_11calculator.servicetest;

import com.example.homework2_11calculator.exceptions.ZeroDividerException;
import com.example.homework2_11calculator.service.CalculatorService;
import com.example.homework2_11calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private final CalculatorService calculatorService= new CalculatorServiceImpl();
    @Test
    void shouldReturnTextWhenOpenCalculator() {
        String result = calculatorService.showHello();
        Assertions.assertEquals("Добро пожаловать в калькулятор!", result);
    }

    @Test
    void shouldReturn10WhenSumOf3And7() {
        int result = calculatorService.plus(4, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    void shouldReturn3WhenMinusOf10And7() {
        int result = calculatorService.minus(2, 1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldReturn15WhenMultiplyOf3And5() {
        int result = calculatorService.multiply(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldReturn3WhenDivide12By4() {
        int result = calculatorService.divide(4, 4);
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldThrowExceptionWhenDivideBy0() {
        Assertions.assertThrows(ZeroDividerException.class, () -> calculatorService.divide(7,0));
    }
}