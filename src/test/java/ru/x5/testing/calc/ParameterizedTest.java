package ru.x5.testing.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private int numberA;
    private int numberB;
    private int expected;
    private Calculator calculator;

    //Inject via constructor
    //for {8, 2, 10}, numberA = 8, numberB = 2, expected = 10
    public ParameterizedTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    @Before
    public void initCalculator(){
        calculator = new Calculator();
    }

    //name attribute is optional, provide an unique name for test
    //multiple parameters, uses Collection<Object[]>
    @Parameterized.Parameters(name = "{index}: testSum({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test
    public void testSumTwoNumbers() {
        Assert.assertEquals(expected, calculator.sum(numberA, numberB));
    }


}
