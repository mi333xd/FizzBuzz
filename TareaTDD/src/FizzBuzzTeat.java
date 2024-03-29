import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTeat {
    @Test
    public void testUno(){
        String result = FizzBuzz.getFizzBuzz(1);
        assertEquals("1", result);
    }
    @Test
    public void testDos() {
        assertEquals("2", FizzBuzz.getFizzBuzz(2));
    }
    @Test
    public void testTres() {
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(3));
    }
    @Test
    public void testCuatro(){
        assertEquals("4", FizzBuzz.getFizzBuzz(4));
    }
    @Test
    public void testCinco(){
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(5));
    }
    @Test
    public void testSeis(){
        assertEquals("Fizz", FizzBuzz.getFizzBuzz((6)));
    }
    @Test
    public void testSiete(){
        assertEquals("7", FizzBuzz.getFizzBuzz(7));
    }
    @Test
    public void testOcho(){
        assertEquals("8", FizzBuzz.getFizzBuzz(8));
    }
    @Test
    public void testNueve(){
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(9));
    }
    @Test
    public void testDiez(){
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(10));
    }
    @Test
    public void testOnce(){
        assertEquals("11", FizzBuzz.getFizzBuzz(11));
    }
    @Test
    public void testDoce(){
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(12));
    }
    @Test
    public void testTrece(){
        assertEquals("13", FizzBuzz.getFizzBuzz(13));
    }
    @Test
    public void testCatorce(){
        assertEquals("14", FizzBuzz.getFizzBuzz(14));
    }
    @Test
    public void testQuince(){
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(15));
    }
}
