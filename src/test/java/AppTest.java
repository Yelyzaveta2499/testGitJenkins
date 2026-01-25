import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void addTwoPositive() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void addWithNegative() {
        assertEquals(0, App.add(2, -2));
    }

    @Test
    void addZero() {
        assertEquals(7, App.add(7, 0));
    }
}

