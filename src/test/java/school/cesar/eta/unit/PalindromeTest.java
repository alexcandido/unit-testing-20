package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void check_palindromeWord_true() {
        String word = "ANA";
        boolean result = Palindrome.check(word);
        Assertions.assertTrue(result);
    }

    @Test
    public void check_notPalindromeWord_false() {
        String word = "ABC";
        boolean result = Palindrome.check(word);
        Assertions.assertFalse(result);
    }

    @Test
    public void check_emptyWord_true() {
        String word = "";
        boolean result = Palindrome.check(word);
        Assertions.assertTrue(result);
    }
}
