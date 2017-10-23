import ciphers.CIPHER;
import ciphers.Converter;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ConverterTest {

    private final static CIPHER GADERYPOLUKI = CIPHER.GADERYPOLUKI;
    private final static CIPHER POLITYKARENU = CIPHER.POLITYKARENU;
    private final static CIPHER KONIECMATURY = CIPHER.KONIECMATURY;

    private Converter testedObject;

    @Before
    public void setUp() throws Exception {
        testedObject = new Converter();
    }

    private Object[][] parametersForSpecificDeciphering() {
        return new Object[][]{
                {"DO NOT TELL ANYONE", GADERYPOLUKI, "EP NPT TDUU GNRPND"},
                {"dO NoT teLl AnyOne", GADERYPOLUKI, "EP NPT TDUU GNRPND"},
                {"THAT YOU HAVE SEEN", POLITYKARENU, "YHKY TPN HKVR SRRU"},
                {"That yOU HaVE seEN", POLITYKARENU, "YHKY TPN HKVR SRRU"},
                {"MY PERSONAL REPOSITORY", KONIECMATURY, "AR PCYSKIML YCPKSNUKYR"},
                {"my PERSOnaL RepOSitORY", KONIECMATURY, "AR PCYSKIML YCPKSNUKYR"},
                {"  ", GADERYPOLUKI, ""},
                {" x ", POLITYKARENU, "X"},
                {"Y  ", KONIECMATURY, "R"},
        };
    }

    @Test
    @Parameters(method = "parametersForSpecificDeciphering")
    public void shouldReturnCorrectDecipheredStrings(String wordToDecipher, CIPHER cipherToUse,
                                                     String expectedDecipheredWord) throws Exception {

        assertEquals(expectedDecipheredWord, testedObject.decipher(wordToDecipher, cipherToUse));
    }
}
