package lecture1.model;

import org.junit.Test;
import static org.junit.Assept.asserEquals;

public class SumTest {

    @Test
    public void sum() {
        assertEquals(0, Sum.sum(0));
        assertEquals(15, Sum.sum(5));
        assertEquals(55, Sum.sum(10));
    }
}
