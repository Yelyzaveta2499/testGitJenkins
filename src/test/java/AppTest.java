import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddValid() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAddNullFirstThrows() {
        assertThrows(IllegalArgumentException.class, () -> App.add(null, 1));
    }

    @Test
    void testAddNullSecondThrows() {
        assertThrows(IllegalArgumentException.class, () -> App.add(1, null));
    }

    @Test
    void testAddBothNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> App.add(null, null));
    }
}
