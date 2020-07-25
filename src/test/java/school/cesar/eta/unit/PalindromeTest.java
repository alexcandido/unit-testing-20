package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    public void setup() {
        palindrome = new Palindrome();
    }

    @Test
    public void check_palindromeWord_true() {
        String word = "ANA";
        boolean result = palindrome.check(word);
        Assertions.assertTrue(result);
    }

    @Test
    public void check_nonPalindromeWord_false() {
        String word = "ABC";
        boolean result = palindrome.check(word);
        Assertions.assertFalse(result);
    }

    @Test
    public void check_emptyWord_true() {
        String word = "";
        boolean result = palindrome.check(word);
        Assertions.assertTrue(result);
    }

    @Test
    public void check_oneCharWord_true() {
        String word = "A";
        boolean result = palindrome.check(word);
        Assertions.assertTrue(result);
    }
}
