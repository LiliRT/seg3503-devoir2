/**
 * SEG3503 Z – Été 2026
* Lili Rose Théoret
* 300342096
* Dimanche 7 juin, 2026
* Devoir 1
 */

// javac -d . -cp "lib/*" ISBNValidate.java ISBNValidateTest.java
// java -javaagent:lib/jacocoagent.jar=destfile=jacoco.exec \
// -jar lib/junit-platform-console-standalone-1.10.0.jar \
// --class-path . \
// --select-class ISBNValidateTest

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ISBNValidateTest {

    // // Cas de test 1
    // @Test
    // void test1appendCheckDigitToISBN12True() {        
    //     String result = ISBNValidate.appendCheckDigitToISBN12("978030640615");
        
    //     assertEquals("9780306406157", result);
    // }

    // // Cas de test 2
    // @Test
    // void test2appendCheckDigitToISBN12False() {                
    //     assertThrows(IllegalArgumentException.class, () -> {
    //         ISBNValidate.appendCheckDigitToISBN12("9780306406150");
    //     });
    // }


    // // Cadre de test 3
    // @Test
    // void test3tidyISBN10or13InsertingDashesTrue() {
    //     String result = ISBNValidate.tidyISBN10or13InsertingDashes("9780306406157");

    //     assertEquals("978-0-306-40615-7", result);
    // }

    // // Cadre de test 4
    // @Test
    // void test4tidyISBN10or13InsertingDashesFalse() {
    //     assertThrows(IllegalArgumentException.class,
    //         () -> ISBNValidate.tidyISBN10or13InsertingDashes("")
    //     );
    // }

    // // Cadre de test 5
    // @Test
    // void test5ShouldAcceptNonNumericalChar() {
    //     String result = ISBNValidate.tidyISBN10or13InsertingDashes("abc9780abc306406157abc");
        
    //     assertEquals("978-0-306-40615-7", result);
    // }

    // // Cadre de test 6
    // @Test
    // void test6ShouldAcceptWrongNumberOfDahses() {
    //     String result = ISBNValidate.tidyISBN10or13InsertingDashes("978--0306406157");
        
    //     assertEquals("978-0-306-40615-7", result);
    // }

    // // Cadre de test 7
    // @Test
    // void test7ShouldAcceptWrongPositionOfDashes() {
    //     String result = ISBNValidate.tidyISBN10or13InsertingDashes("9780-306-406157");
    
    //     assertEquals("978-0-306-40615-7", result);
    // }

    // // Cadre de test 8
    // @Test
    // void test8ShouldRejectInvalidChecksum() {
    //     assertThrows(IllegalArgumentException.class,
    //         () -> ISBNValidate.tidyISBN10or13InsertingDashes("9780306406150")
    //     );
    // }

    // // Cadre de test 9
    // @Test
    // void test9ShouldRejectInvalidPusblisherNumber() {
    //     assertThrows(IllegalArgumentException.class,
    //         () -> ISBNValidate.tidyISBN10or13InsertingDashes("2220306406157")
    //     );
    // }

    // // Cadre de test 10
    // @Test
    // void test10ShouldRejectInvalidFinalLength() {
    //     assertThrows(IllegalArgumentException.class,
    //         () -> ISBNValidate.tidyISBN10or13InsertingDashes("97803064061")
    //     );
    // }

    // Cadre de test 1
    @Test
    void test1tidyISBN10or13InsertingDashesTrue10() {
        String result = ISBNValidate.tidyISBN10or13InsertingDashes("0306406152");

        assertEquals("0-306-40615-2", result);
    }

    // Cadre de test 2
    @Test
    void test2tidyISBN10or13InsertingDashesTrue13() {
        String result = ISBNValidate.tidyISBN10or13InsertingDashes("9780306406157");

        assertEquals("978-0-306-40615-7", result);
    }
    @Test
    void testTidyInsert_null() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13InsertingDashes(null)
        );
    }
    @Test
    void testTidyInsert_empty() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13InsertingDashes("")
        );
    }
    @Test
    void testTidyInsert_tooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13InsertingDashes("123456789012345")
        );
    }
    @Test
    void testTidyInsert_isbn10() {
        String result = ISBNValidate.tidyISBN10or13InsertingDashes("0306406152");
        assertEquals("0-306-40615-2", result);
    }
    @Test
    void testTidyInsert_isbn13() {
        String result = ISBNValidate.tidyISBN10or13InsertingDashes("9780306406157");
        assertEquals("978-0-306-40615-7", result);
    }
    @Test
    void testTidyRemove_null() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13RemovingDashes(null)
        );
    }
    @Test
    void testTidyRemove_empty() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13RemovingDashes("")
        );
    }
    @Test
    void testTidyRemove_tooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.tidyISBN10or13RemovingDashes("123456789012345")
        );
    }
    @Test
    void testTidyRemove_isbn10() {
        String result = ISBNValidate.tidyISBN10or13RemovingDashes("0-306-40615-2");
        assertEquals("0306406152", result);
    }
    @Test
    void testTidyRemove_isbn13() {
        String result = ISBNValidate.tidyISBN10or13RemovingDashes("978-0-306-40615-7");
        assertEquals("9780306406157", result);
    }
    @Test
    void testIsbn10To13_invalidLength() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.isbn10To13("123")
        );
    }
    @Test
    void testIsbn10To13_valid() {
        String result = ISBNValidate.isbn10To13("0618680004");
        assertEquals("978-0-618-68000-9", result);
    }
    @Test
    void testIsbn13To10_invalidLength() {
        assertThrows(IllegalArgumentException.class, () ->
            ISBNValidate.isbn13To10("123")
        );
    }
    @Test
    void testIsbn13To10_valid978() {
        String result = ISBNValidate.isbn13To10("9780618680009");
        assertEquals("0618680004", result);
    }
    @Test
    void testIsbn13To10_not978() {
        String result = ISBNValidate.isbn13To10("9790618680009");
        assertEquals("n/a", result);
    }


}