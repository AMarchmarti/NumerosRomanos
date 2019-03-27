package org.lasencinas;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanosMainTest {

    @Test
    public void sumarValoresTest(){
        String numero = "MDCCCLXXXVIII";
        assertEquals(1888, sumarValores(numero));
    }
}
