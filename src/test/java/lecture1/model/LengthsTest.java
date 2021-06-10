package lecture1.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class LengthsTest {
    @Test
    public void length() {
        assertEquals(5, Lengths.length(0, 0, 3, 4), 0.000001);
        assertEquals(5, Lengths.length(3, 0, 0, 4), 0.000001);
        assertEquals(1.4142135, Lengths.length(0, 1, 1, 0), 0.000001);
        assertEquals(14.142135, Lengths.length(0.000000001, 0.000000001, 10, 10), 0.000001);
        assertEquals(20.748939, Lengths.length(1.6, 2.444, -1.223, 23), 0.000001);

    }
}