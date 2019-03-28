package org.lasencinas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.NumerosRomanos.*;

public class NumerosRomanosTest {

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
        assertTrue(NumerosRomanos.verificarString(mil));
        assertTrue(NumerosRomanos.verificarString(dosMil));
        assertTrue(NumerosRomanos.verificarString(tresMil));
        //assertTrue(NumerosRomanos.verificarString(cuatroMil));
        assertTrue(NumerosRomanos.verificarString(numeroSencillo));
        assertTrue(NumerosRomanos.verificarString(numero));
        assertTrue(NumerosRomanos.verificarString(numeroComplejo));
        //assertTrue(NumerosRomanos.verificarString(numeroFallo));
    }

    @Test
    public void buscarGruposRestaTest(){
        String numeroSencillo = "IX";
        String numero = "MCM";
        String numeroComplejo = "MCMXCIX";
        assertNotNull(NumerosRomanos.buscarGruposResta(numeroSencillo));
        assertNotNull(NumerosRomanos.buscarGruposResta(numero));
        assertNotNull(NumerosRomanos.buscarGruposResta(numeroComplejo));
        assertTrue(NumerosRomanos.buscarGruposResta(numeroComplejo).contains("CM"));

    }

    @Test
    public void sumaValoresTest(){
        String facil = "M";
        String sencillo = "II";
        String normal = "MDL";
        String complejo = "MDCLXVI";
        String dificil = "MDCCCLXXXVIII";
        assertEquals(1000, NumerosRomanos.sumaValores(facil));
        assertEquals(2, NumerosRomanos.sumaValores(sencillo));
        assertEquals(1550, NumerosRomanos.sumaValores(normal));
        assertEquals(1666, NumerosRomanos.sumaValores(complejo));
        assertEquals(1888, NumerosRomanos.sumaValores(dificil));
    }
}
