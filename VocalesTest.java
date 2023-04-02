import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @Test
    void testContarVocales_HolaMundo() {
        int resultadoActual = Vocales.contarVocales("Hola mundo");
        assertEquals(4, resultadoActual);
    }

    @Test
    void testContarVocales_EstoEsUnaCadena() {
        int resultadoActual = Vocales.contarVocales("Esto Es una cadenA");
        assertEquals(8, resultadoActual);
    }

    @Test
    void testContarVocales_JavaMolaMogollon() {
        int resultadoActual = Vocales.contarVocales("Java mola mogollOn");
        assertEquals(7, resultadoActual);
    }

    @Test
    void testContarVocales_4h0r4s0nnum3r0s() {
        int resultadoActual = Vocales.contarVocales("4h0r4 s0n num3r0s");
        assertEquals(1, resultadoActual);
    }

    @Test
    void testContarVocales_CadenaSinVocales() {
        int resultadoActual = Vocales.contarVocales("Cadena S1n Vocales");
        assertEquals(6, resultadoActual);
    }
}