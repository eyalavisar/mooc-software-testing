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

}