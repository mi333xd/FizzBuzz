import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OperacionesTDDTest {
    @Test
    public void testSumaConCadenaVacia(){
        int resultado = OperacionesTDD.suma("");
        assertEquals(0,resultado);
    }
    @Test
    public void testSumaConNumero1Devuelve1(){
        int resultado = OperacionesTDD.suma("1");
        assertEquals(1,resultado);
    }
    @Test
    public void testSSuma2Numeros(){
        assertEquals(3, OperacionesTDD.suma("1,2"));
    }
    @Test
    public void testSuma3Numeroshazl(){
        assertEquals(4,OperacionesTDD.suma("1,1,2"));
    }
    @Test
    public void testSumaSeparadorSinNumero() {
        int resultado = OperacionesTDD.suma("1,2,");
        assertEquals(-1, resultado);
    }
    @Test
    public void testSumaConUnNumeroNegativo() {
        int resultado = OperacionesTDD.suma("1,2,-2");
        assertEquals(-1, resultado);
    }
}
