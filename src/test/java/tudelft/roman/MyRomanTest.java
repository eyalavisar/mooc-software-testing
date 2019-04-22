package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRomanTest {
    private MyRoman roman;

    @BeforeEach
    void intializeMyRoman() {
        roman = new MyRoman();
    }

    @Test
    void convertSingleDigit() {
        int result = roman.convertToInteger("I");

        Assertions.assertEquals(1, result);
    }

    @Test
    void convertMultiDigit() {
        int result = roman.convertToInteger("VIII");

        Assertions.assertEquals(8, result);
    }

    @Test
    void convertSubtractiveNotation() {
        int result = roman.convertToInteger("IX");

        Assertions.assertEquals(9, result);
    }

    @Test
    void convertCompositeNotation() {
        int result = roman.convertToInteger("CIV");

        Assertions.assertEquals(104, result);
    }

    @Test
    void convertTwoSubtractivesComposite() {
        int result = roman.convertToInteger("CDIV");

        Assertions.assertEquals(404, result);
    }

    @Test
    void convertIllegalNumber() {
        Integer result = roman.convertToInteger("IIII");

        Assertions.assertEquals(null, result);
    }
}