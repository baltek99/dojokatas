import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sprint2Test {

    @Test
    void multi() {
        Sprint2 sprint2 = new Sprint2();
        assertEquals(12, sprint2.multi(4,3));
    }

    @Test
    void delta() {
        Sprint2 sprint2 = new Sprint2();
        assertEquals(0,sprint2.delta(1,0,10));
        assertEquals(1,sprint2.delta(1,2,1));
    }

    @Test
    void nthSmallest() {
        Sprint2 sprint2 = new Sprint2();
        int[] num ={12,23,51,6,1,31,41,61,1,2,4};

        assertEquals(4, sprint2.nthSmallest(num,3));
    }
    @Test
    void  seq(){
        Sprint2 sprint2 = new Sprint2();
        char[] s1 = {'a','b', 'c'};
        char[] s2 = {'a','b', 'c', 'd'};
        assertTrue(sprint2.seq(s1,s2).equals("abc"));
    }
}