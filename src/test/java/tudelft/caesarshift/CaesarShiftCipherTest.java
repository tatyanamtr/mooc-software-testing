package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher csc;

    @BeforeEach
    public void initialize(){
        this.csc = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "message={0}, shift={1}")
    @CsvSource({ "Abc,3", "n1m,2", "ko#,5" })
    public void Invalid(String message, int shift){
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals("invalid", result);
    }
    @ParameterizedTest(name = "message={0}, shift={1}, expResult={2}")
    @CsvSource({ "abc,3,def", "abc,-3,xyz" })
    public void Positive(String message, int shift, String expResult){
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expResult={2}")
    @CsvSource({ "abc,29,def", "abc,-29,xyz" })
    public void ShiftIsMoreThan26(String message, int shift, String expResult){
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expResult, result);
    }


}
