import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselTest {

    @Test
    void pesel() {
        int[] pesel = {9, 9, 1, 2, 3, 4, 1, 9, 0};
        assertFalse(Pesel.pesel(pesel));
        int[] pesel2 = {9, 9, 1, 1, 3, 0, 0, 8, 2, 7, 0};
        assertTrue(Pesel.pesel(pesel2));
    }
}