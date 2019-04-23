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
    public void notEnoughBarsBoundryBig(){
        int result = bags.calculate(0,2,11);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void notEnoughBarsBoundrySmall(){
        int result = bags.calculate(1,0,2);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void bigBars(){
        int result = bags.calculate(2,2,10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigBarsBoundry(){
        int result = bags.calculate(0,2,10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void smallAndBigBars(){
        int result = bags.calculate(2,2,6);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void smallAndBigBarsBoundry(){
        int result = bags.calculate(2,2,12);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void smallBars(){
        int result = bags.calculate(4,4,3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void smallBarsBoundry(){
        int result = bags.calculate(3,4,3);
        Assertions.assertEquals(3, result);
    }
}