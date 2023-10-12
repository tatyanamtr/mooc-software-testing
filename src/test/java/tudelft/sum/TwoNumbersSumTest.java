package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.caesarshift.CaesarShiftCipher;

import java.util.*;

public class TwoNumbersSumTest {

    private TwoNumbersSum sum;

    @BeforeEach
    public void initialize(){
        this.sum = new TwoNumbersSum();
    }

    @Test
    public void SameLength(){
        ArrayList first = new ArrayList<>();
        first.add(2);
        first.add(4);
        first.add(3);
        ArrayList second = new ArrayList<>();
        second.add(5);
        second.add(6);
        second.add(4);

        ArrayList result = sum.addTwoNumbers(first, second);

        ArrayList expResult = new ArrayList<>();
        expResult.add(7);
        expResult.add(0);
        expResult.add(8);
        Assertions.assertEquals(expResult, result);

    }

    @Test
    public void DifferentLength(){
        ArrayList first = new ArrayList<>();
        first.add(9);
        first.add(9);
        first.add(9);
        first.add(9);
        first.add(9);
        first.add(9);
        first.add(9);

        ArrayList second = new ArrayList<>();
        second.add(9);
        second.add(9);
        second.add(9);
        second.add(9);

        ArrayList result = sum.addTwoNumbers(first, second);

        ArrayList expResult = new ArrayList<>();
        expResult.add(8);
        expResult.add(9);
        expResult.add(9);
        expResult.add(9);
        expResult.add(0);
        expResult.add(0);
        expResult.add(0);
        expResult.add(1);
        Assertions.assertEquals(expResult, result);

    }
}
