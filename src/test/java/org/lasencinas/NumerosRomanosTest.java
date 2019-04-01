package org.lasencinas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.NumerosRomanos.*;

public class NumerosRomanosTest {

    String regexRestan = "(C[DM])|(X[LC])|(I[VX])";
    String regexSuman = "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])";

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
        assertNotNull(NumerosRomanos.buscarGruposResta(regexRestan,numeroSencillo));
        assertNotNull(NumerosRomanos.buscarGruposResta(regexRestan, numero));
        assertNotNull(NumerosRomanos.buscarGruposResta(regexRestan, numeroComplejo));
        assertTrue(NumerosRomanos.buscarGruposResta(regexRestan, numeroComplejo).contains("CM"));

    }

    @Test
    public void buscarGruposSumaTest(){
        String facil = "M";
        String sencillo = "II";
        String normal = "MDL";
        String dificil = "MDCCCLXXXVIII";
        assertNotNull(NumerosRomanos.buscarGruposSuma(regexSuman, facil));
        assertNotNull(NumerosRomanos.buscarGruposSuma(regexSuman, sencillo));
        assertNotNull(NumerosRomanos.buscarGruposSuma(regexSuman, normal));
        assertNotNull(NumerosRomanos.buscarGruposSuma(regexSuman, dificil));
        assertTrue(NumerosRomanos.buscarGruposSuma(regexSuman, dificil).contains("M"));
    }

    @Test
    public void sumaValoresTest(){
        String facil = "M";
        String sencillo = "II";
        String normal = "MDL";
        String complejo = "MDCLXVI";
        String dificil = "MDCCCLXXXVIII";
        assertEquals(1000, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposSuma(regexSuman, facil)), 0);
        assertEquals(2, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposSuma(regexSuman, sencillo)), 0);
        assertEquals(1550, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposSuma(regexSuman, normal)), 0);
        assertEquals(1666, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposSuma(regexSuman, complejo)), 0);
        assertEquals(1888, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposSuma(regexSuman, dificil)), 0);
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
        assertEquals(4, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, facil)), 0);
        assertEquals(9, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, sencillo)), 0);
        assertEquals(99, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, normal)), 0);
        assertEquals(990, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, complejo)), 0);
        assertEquals(404, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, dificil)), 0);
        assertEquals(999, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, leyenda)), 0);
        assertEquals(444, NumerosRomanos.sumaValores(NumerosRomanos.buscarGruposResta(regexRestan, dios)), 0);
    }

    @Test
    public void valorFinalTest(){
        String facil ="XIV";
        String sencillo = "XXVI";
        String normal = "CXLV";
        String semiNormal = "CD";
        String complejo = "CCCXLII";
        String dificil = "DLXXXIX";
        String leyenda = "MMMCMLI";
        String dios = "MCMXLVII";
        String diosDos = "MMMCMXCIX";
        String cuatroCientosCatorce = "CDXIV";
        String cuatroCientosTreintaNueve  = "CDXXXIX";
        assertEquals(14, NumerosRomanos.valorFinal(facil), 0);
        assertEquals(26, NumerosRomanos.valorFinal(sencillo), 0);
        assertEquals(145, NumerosRomanos.valorFinal(normal), 0);
        assertEquals(400, NumerosRomanos.valorFinal(semiNormal), 0);
        assertEquals(342, NumerosRomanos.valorFinal(complejo), 0);
        assertEquals(589, NumerosRomanos.valorFinal(dificil), 0);
        assertEquals(3951, NumerosRomanos.valorFinal(leyenda), 0);
        assertEquals(1947, NumerosRomanos.valorFinal(dios), 0);
        assertEquals(3999, NumerosRomanos.valorFinal(diosDos), 0);
        assertEquals(414, NumerosRomanos.valorFinal(cuatroCientosCatorce), 0);
        assertEquals(439, NumerosRomanos.valorFinal(cuatroCientosTreintaNueve), 0);
    }
}
