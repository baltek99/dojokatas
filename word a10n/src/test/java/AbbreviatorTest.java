import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviatorTest {
    private Abbreviator abbr = new Abbreviator();
    @org.junit.jupiter.api.Test
    public void testInternationalization() {
        //abbr.abbreviate("internationalization");
        assertEquals("i18n", abbr.abbreviate("internationalization"));
    }

    @Test
    void isCharALatter() {
        assertTrue(abbr.isCharALatter('c'));
        assertTrue(abbr.isCharALatter('a'));
        assertTrue(abbr.isCharALatter('A'));
        assertTrue(abbr.isCharALatter('Z'));
        assertTrue(abbr.isCharALatter('z'));
        assertFalse(abbr.isCharALatter('-'));
        assertFalse(abbr.isCharALatter(' '));
    }
}