package org.lasencinas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.RomanosMain.*;

public class RomanosMainTest {

    @Test
    public void verificarStringTest(){
        String mil = "M";
        String dosMil = "MM";
        String tresMil = "MMM";
        //String cuatroMil = "MMMM"; Va a fallar
        String numeroSencillo = "MDCLXVI";
        String numero = "CMXCIX";
        String numeroComplejo = "CMXCIX";
        //String numeroFallo = "XCD"; Test para fallar
        assertTrue(RomanosMain.verificarString(mil));
        assertTrue(RomanosMain.verificarString(dosMil));
        assertTrue(RomanosMain.verificarString(tresMil));
        //assertTrue(RomanosMain.verificarString(cuatroMil));
        assertTrue(RomanosMain.verificarString(numeroSencillo));
        assertTrue(RomanosMain.verificarString(numero));
        assertTrue(RomanosMain.verificarString(numeroComplejo));
        //assertTrue(RomanosMain.verificarString(numeroFallo));
    }

    @Test
    public void calculoNumerosRomanosTest(){
        //Sumatorios
        String numeroSencillo = "MDCLXVI";
        assertEquals(1666, RomanosMain.calculoNumerosRomanos(numeroSencillo));
    }
}
