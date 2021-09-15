import com.small.squareodd.SquareOdd;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareOdd_Test {
    @Test
    public void shouldShow294816For23496() {
        assertEquals(294816, new SquareOdd().convert(23496));
    }

    @Test
    public void shouldShow8181For99() {
        assertEquals(8181, new SquareOdd().convert(99));
    }
}
