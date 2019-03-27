package org.lasencinas;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RomanosTest{
    public static String[] malditosRomanos;

    @BeforeClass
    public static void CreacionArrayNumerosRomanos(){
        malditosRomanos = new String[7];
        int numerosRomanos = 0;
        for (Romanos romanos : Romanos.values()){
            malditosRomanos[romanos.ordinal()] = romanos.name();
            numerosRomanos += 1;
        }
        assertThat(numerosRomanos).isEqualTo(Romanos.values().length);
    }


    @Test
    public void getNumeroDecimalTest(){
        Romanos numeroRomano = Romanos.M;
        assertThat(numeroRomano.getValorDecimal()).isEqualTo(1000);
    }
}
