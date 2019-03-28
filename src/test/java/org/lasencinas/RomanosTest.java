package org.lasencinas;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RomanosTest{
    public static String[] malditosRomanos;

    @BeforeClass
    public static void CreacionArrayNumerosRomanos(){
        malditosRomanos = new String[13];
        int numerosRomanos = 0;
        for (Romanos romanos : Romanos.values()){
            malditosRomanos[romanos.ordinal()] = romanos.name();
            numerosRomanos += 1;
        }
        assertThat(numerosRomanos).isEqualTo(Romanos.values().length);
    }

    @Test
    public void RomanosConstructorTest() {
        // voy a asegurarme de que los metodos de los Enum Types
        // se comportan como yo espero
        Romanos numeroRomano = Romanos.M;
        assertThat(numeroRomano).isInstanceOf(Romanos.class);
        assertThat(numeroRomano.ordinal()).isEqualTo(6);
        assertThat(numeroRomano.name()).isEqualToIgnoringWhitespace("M");
        assertThat(Romanos.valueOf(numeroRomano.name())).isEqualTo(Romanos.M);
        assertThat(numeroRomano.compareTo(numeroRomano.M)).isEqualTo(0);
        assertThat(numeroRomano.toString()).isEqualToIgnoringWhitespace("M");
        assertThat(numeroRomano.equals(numeroRomano.M)).isEqualTo(true);
        assertThat(Romanos.values()[6]).isEqualTo(numeroRomano);
    }
    @Test
    public void getNumeroDecimalTest(){
        Romanos numeroRomano = Romanos.M;
        assertThat(numeroRomano.getValorDecimal()).isEqualTo(1000);
    }
}
