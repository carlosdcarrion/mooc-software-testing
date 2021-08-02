package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "String={0}, Result={1}")
    @CsvSource({"xxggxx,true",
                "xxgxx,false",
                "xxggyygxx,false",
                "gxxxx,false"})
    public void gHappyTest (String str,  boolean expectedResult) {
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
