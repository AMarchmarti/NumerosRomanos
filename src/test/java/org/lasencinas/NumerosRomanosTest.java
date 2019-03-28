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
        assertEquals(1000, NumerosRomanos.sumaValores(facil), 0);
        assertEquals(2, NumerosRomanos.sumaValores(sencillo), 0);
        assertEquals(1550, NumerosRomanos.sumaValores(normal), 0);
        assertEquals(1666, NumerosRomanos.sumaValores(complejo), 0);
        assertEquals(1888, NumerosRomanos.sumaValores(dificil), 0);
    }

    @Test
    public void sumaValoresExtraidosTest(){
        String facil ="IV";
        String sencillo = "IX";
        String normal = "XCIX";
        String complejo = "CMXC";
        String dificil = "CDIV";
        String leyenda = "CMXCIX";
        String dios = "CDXLIV";
        assertEquals(4, NumerosRomanos.sumaValoresExtraidos(facil), 0);
        assertEquals(9, NumerosRomanos.sumaValoresExtraidos(sencillo), 0);
        assertEquals(99, NumerosRomanos.sumaValoresExtraidos(normal), 0);
        assertEquals(990, NumerosRomanos.sumaValoresExtraidos(complejo), 0);
        assertEquals(404, NumerosRomanos.sumaValoresExtraidos(dificil), 0);
        assertEquals(999, NumerosRomanos.sumaValoresExtraidos(leyenda), 0);
        assertEquals(444, NumerosRomanos.sumaValoresExtraidos(dios), 0);
    }

    @Test
    public void valorFinalTest(){
        String facil ="XIV";
        String sencillo = "XXVI";
        String normal = "CXLV";
        String complejo = "CCCXLII";
        String dificil = "DLXXXIX";
        String leyenda = "MMMCMLI";
        String dios = "MCMXLVII";
        assertEquals(14, NumerosRomanos.sumaValoresExtraidos(facil), 0);
        assertEquals(26, NumerosRomanos.sumaValoresExtraidos(sencillo), 0);
        assertEquals(145, NumerosRomanos.sumaValoresExtraidos(normal), 0);
        assertEquals(342, NumerosRomanos.sumaValoresExtraidos(complejo), 0);
        assertEquals(589, NumerosRomanos.sumaValoresExtraidos(dificil), 0);
        assertEquals(3951, NumerosRomanos.sumaValoresExtraidos(leyenda), 0);
        assertEquals(1947, NumerosRomanos.sumaValoresExtraidos(dios), 0);
    }
}
