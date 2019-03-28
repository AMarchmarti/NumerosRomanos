package org.lasencinas;

import java.util.Arrays;
import java.util.List;

public enum Romanos {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000),
    IV(4),
    IX(9),
    XL(40),
    XC(90),
    CD(400),
    CM(900);

    //Atributos
    private int valorDecimal;
    //private List<String> numerosRomanos = null;

    //Constructor
    Romanos(Integer decimal){
        this.valorDecimal = decimal;
    }

    //Getters


    public int getValorDecimal() {
        return valorDecimal;
    }
}