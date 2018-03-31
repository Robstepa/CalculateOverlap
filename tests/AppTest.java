import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App app;

    @BeforeEach
    void instance() {
        app = new App();
    }


    @Test
    void testIfOverlap() {
        assertEquals(36, app.calculate(-1, -1, 10, 10, -1,0, 3, 9));
    }

    @Test
    void testIfNotOverlap() {
        assertEquals(0, app.calculate(-12, -4, -1, -2, 0,0, 100, 3000));
    }
}