package tudelft.chocolate;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class ChocolateBagsMyTest {

    ChocolateBags bags = new ChocolateBags();

    @Test
    public void notEnoughBars(){
        int result = bags.calculate(2,2,13);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void bigBars(){
        int result = bags.calculate(2,2,10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void smallAndBigBars(){
        int result = bags.calculate(2,2,6);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void smallBars(){
        int result = bags.calculate(4,4,3);
        Assertions.assertEquals(3, result);
    }
}