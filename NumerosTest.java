import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    void testSonIguales4_55_7() {
        int resultadoActual = Numeros.sonIguales(4,55,7);
        assertEquals(2, resultadoActual);
    }

    @Test
    void testSonIguales14_23_27() {
        int resultadoActual = Numeros.sonIguales(14,23,27);
        assertEquals(2, resultadoActual);
    }

    @Test
    void testSonIguales14_55_14() {
        int resultadoActual = Numeros.sonIguales(14,55,14);
        assertEquals(1, resultadoActual);
    }

    @Test
    void testSonIguales14_14_33() {
        int resultadoActual = Numeros.sonIguales(14,14,33);
        assertEquals(1, resultadoActual);
    }

    @Test
    void testSonIguales32_55_55() {
        int resultadoActual = Numeros.sonIguales(32,55,55);
        assertEquals(1, resultadoActual);
    }

    @Test
    void testSonIguales329_329_329() {
        int resultadoActual = Numeros.sonIguales(329,329,329);
        assertEquals(0, resultadoActual);
    }
}