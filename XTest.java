import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XTest {

    private X x;

    @BeforeEach
    void preparar() {
        x = new X(new A(10));   // se ejecuta antes de CADA test
    }

    @Test
    void w1DevuelveTrue() {
        assertTrue(x.w1());
    }

    @Test
    void z1DevuelveCero() {
        assertEquals(0, x.z1());
    }

    @Test
    void z2DevuelveUnoSiTrue() {
        assertEquals(1.0f, x.z2(true));
    }

    @Test
    void z2DevuelveCeroSiFalse() {
        assertEquals(0.0f, x.z2(false));
    }

    @Test
    void toStringIncluyeElA() {
        assertEquals("X{a=A{id=10}}", x.toString());
    }

    @Test
    void xEsUnaZYUnaW() {
        assertTrue(x instanceof Z);
        assertTrue(x instanceof W);
    }
}
