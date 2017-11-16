import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IsbnVerifierTest {
    private IsbnVerifier isbnVerifier;

    @Before
    public void setUp() {
        isbnVerifier = new IsbnVerifier();
    }

    @Test
    public void validIsbnNumber() {
        Assert.assertEquals(true, isbnVerifier.isValid("3-598-21508-8"));
    }

    @Ignore("Remove to run test")
    @Test
    public void invalidIsbnCheckDigit() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-21508-9"));
    }

    @Ignore("Remove to run test")
    @Test
    public void validIsbnNumberWithCheckDigitOfTen() {
        Assert.assertEquals(true, isbnVerifier.isValid("3-598-21507-X"));
    }

    @Ignore("Remove to run test")
    @Test
    public void checkDigitIsACharacterOtherThanX() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-21507-A"));
    }

    @Ignore("Remove to run test")
    @Test
    public void invalidCharacterInIsbn() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-2K507-0"));
    }

    @Ignore("Remove to run test")
    @Test
    public void xIsOnlyValidAsACheckDigit() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-2X507-9"));
    }

    @Ignore("Remove to run test")
    @Test
    public void validIsbnWithoutSeparatingDashes() {
        Assert.assertEquals(true, isbnVerifier.isValid("3598215088"));
    }

    @Ignore("Remove to run test")
    @Test
    public void isbnWithoutSeparatingDashesAndXAsCheckDigit() {
        Assert.assertEquals(true, isbnVerifier.isValid("359821507X"));
    }

    @Ignore("Remove to run test")
    @Test
    public void isbnWithoutCheckDigitAndDashes() {
        Assert.assertEquals(false, isbnVerifier.isValid("359821507"));
    }

    @Ignore("Remove to run test")
    @Test
    public void tooLongIsbnAndNoDashes() {
        Assert.assertEquals(false, isbnVerifier.isValid("3598215078X"));
    }

    @Ignore("Remove to run test")
    @Test
    public void isbnWithoutCheckDigit() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-21507"));
    }

    @Ignore("Remove to run test")
    @Test
    public void tooLongIsbn() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-21507-XX"));
    }

    @Ignore("Remove to run test")
    @Test
    public void checkDigitOfXShouldNotBeUsedForZero() {
        Assert.assertEquals(false, isbnVerifier.isValid("3-598-21515-X"));
    }

}