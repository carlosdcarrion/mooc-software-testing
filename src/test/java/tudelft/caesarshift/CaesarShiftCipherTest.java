package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest
    @CsvSource({"abc,1,bcd","abc,2,cde","abc,3,def","abc,-1,zab","abc,-2,yza","abc,-3,xyz"})
    public void cscTest (String message, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
