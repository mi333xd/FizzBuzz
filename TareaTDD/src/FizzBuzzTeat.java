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
}
