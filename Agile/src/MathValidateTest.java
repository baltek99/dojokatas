import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathValidateTest {

    @Test
    void mathValidate() {
        assertTrue(MathValidate.mathValidate("1 + 2 = 3"));
        assertFalse(MathValidate.mathValidate("1 + 2 = -3"));
    }
}