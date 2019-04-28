package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ChocolateBagsParametrizedTest {
    ChocolateBags bags = new ChocolateBags();

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({"0,0,1,-1", "0,1,6,-1", "1,0,2,-1", "1,1,7,-1"})
    public void notEnoughBars(int small, int big, int bars, int expected) {
        int result = bags.calculate(small, big, bars);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1,2,10,0", "0,2,10,0", "2,3,10,0"})
    public void onlyBigBars(int small, int big, int total, int expected) {
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1,1,6,1", "2,1,6,1", "2,2,6,1"})
    public void bigAndSmallBars(int small, int big, int total, int expected){
        int actual = bags.calculate(small, big, total);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"2,0,2,2", "2,1,2,2", "3,3,2,2"})
    void onlySmallBars(int small, int big, int total, int expected){
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }
}