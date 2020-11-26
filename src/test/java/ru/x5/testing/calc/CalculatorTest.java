package ru.x5.testing.calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initializationCalculator(){
        calculator = new Calculator();
    }

    @After
    public void destroyObjectCalculator(){
        calculator = null;
    }

    @Test
    public void testSumPositiveNumbersOneAndOne(){
        int actual = calculator.sum(1,1);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testDifferenceNumbersOneAndMinusOne(){
        int actual = calculator.diff(1,1);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testDividePositiveNumbersFourAndOne(){
        int actual = calculator.div(4,1);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicationNegativeNumbersFiveAndFive(){
        int actual = calculator.mult(-5,-5);
        int expected = 25;
        assertEquals(expected, actual);
    }

    @Test(timeout = 10L)
    public void testPerformance100000SumInCycle(){
        for (int i=0; i<=1000; i++){
            calculator.sum(1,(int) Math.random()*100);
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testThrowArithmeticExceptionByDivideByZero(){
        calculator.div(1,0);
    }

}
