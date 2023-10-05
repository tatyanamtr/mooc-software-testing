package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy ghappy;

    @BeforeEach
    public void initialize(){
        this.ghappy = new GHappy();
    }

    @Test
    public void withoutG(){
        Assertions.assertFalse(ghappy.gHappy("xxxxxx"));
    }

    @Test
    public void WithSpace(){
        Assertions.assertFalse(ghappy.gHappy("xxg gxxx"));
    }

    @Test
    public void firstAndLastG(){
        Assertions.assertFalse(ghappy.gHappy("gxxxxg"));
    }

    @Test
    public void upperG(){
        Assertions.assertTrue(ghappy.gHappy("xxGGxx"));
    }

    @Test
    public void oneGAndTwoG(){
        Assertions.assertTrue(ghappy.gHappy("gxxggx"));
    }

}
