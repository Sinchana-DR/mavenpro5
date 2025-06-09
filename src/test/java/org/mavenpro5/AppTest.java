package org.mavenpro5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AppTest
{
    Calci c = new Calci();
    void testAddition() {
        assertEquals(7, c.addition(3, 4));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, c.subtraction(3, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, c.multiplication(3, 4));
    }
    @Test
    void testDivision() {
        assertEquals(2, c.division(8, 4));
    }       

    @Test
    void testRemainder() {
        assertEquals(2, c.remainder(8, 3));
    }

    
}
