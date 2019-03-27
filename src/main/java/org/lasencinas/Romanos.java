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
    M(1000);

    //Atributos
    private int valorDecimal;
    //private List<String> numerosRomanos = null;

    //Constructor
    Romanos(Integer decimal){
        this.valorDecimal = decimal;
    }

}