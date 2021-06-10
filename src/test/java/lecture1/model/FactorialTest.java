package lecture1.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void factorial() {
        assertEquals(1, Factorial.factorial((byte) 0));
        assertEquals(1, Factorial.factorial((byte) 1));
        assertEquals(2, Factorial.factorial((byte) 2));
        assertEquals(120, Factorial.factorial((byte) 5));
        assertEquals(5040, Factorial.factorial((byte) 7));
    }
}