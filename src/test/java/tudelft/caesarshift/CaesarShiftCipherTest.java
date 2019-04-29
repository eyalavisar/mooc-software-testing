package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    CaesarShiftCipher cipher = new CaesarShiftCipher();

    //test cases shift = +-0, +-26
    //test cases message = "", one letter, none letters, mixed
    @ParameterizedTest(name = "message={0},shift={1},expected={2}")
    @CsvSource({"h,0,h", "a,26,a", "hi,26,hi",
                "h,1,i", "h,-1,g", "a,25,z", "a,27,b",
                "Hab,5,invalid", "abc-,5,invalid", "a-bc,7,invalid",
                "abc,3,def", "5-,2,invalid", "'',3,''"})
    void testAlgorithm(String message, int shift, String expected) {
        String result = cipher.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expected,result);
    }
}
