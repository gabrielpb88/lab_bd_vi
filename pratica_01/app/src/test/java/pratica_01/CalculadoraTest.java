package pratica_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void powTest(){
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.pow(2, 3));
    }
}
