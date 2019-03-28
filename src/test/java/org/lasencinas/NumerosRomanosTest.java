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
    public void buscarGruposSumaTest(){
        //Sumatorios
        String numeroSencillo = "MDCLXVI";
        assertNotNull(NumerosRomanos.buscarGruposSuma(numeroSencillo));
        System.out.println(NumerosRomanos.buscarGruposSuma(numeroSencillo));;
    }
}
