import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OperacionesTDDTest {
    @Test
    public void testSumaConCadenaVacia(){
        String cadena ="";
        int resultado = OperacionesTDD.suma(cadena);
        assertEquals(0,resultado);
    }
    @Test
    public void testSumaConNumero1Devuelve1(){
        String cadema ="1";
        int resultado = OperacionesTDD.suma(cadema);
        assertEquals(1,resultado);
    }
}
