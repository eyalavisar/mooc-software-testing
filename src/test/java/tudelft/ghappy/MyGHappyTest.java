package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyGHappyTest {
    GHappy happy = new GHappy();

    @ParameterizedTest
    @CsvSource({"g,false", "x,true"})
    void  oneLetter(String letter, boolean expected) {
        boolean result = happy.gHappy(letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "gString={0}, happy={1}")
    @CsvSource({"g,false", "xg,false", "gy,false", "x,true", "yx,true",
                "gg,true", "ggg,true", "gxg,false", "ggxg,false", "ggygg,true"})
    void  algorithmTest(String letter, boolean expected) {
        boolean result = happy.gHappy(letter);
        Assertions.assertEquals(expected, result);
    }

}