package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class MirrorTest {

    private Mirror mir;

    @BeforeEach
    public void initialize() {
        this.mir = new Mirror();
    }

    @Test
    public void EvenLength() {
        String result = mir.mirrorEnds("abfghhba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void UnevenLength() {
        String result = mir.mirrorEnds("abcfgdhhcba");
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void WholeStringEvenLength() {
        String result = mir.mirrorEnds("abba");
        Assertions.assertEquals("abba", result);
    }

    @Test
    public void WholeStringUnevenLength() {
        String result = mir.mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }
}
