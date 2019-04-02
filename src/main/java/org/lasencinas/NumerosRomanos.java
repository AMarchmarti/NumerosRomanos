package org.lasencinas;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos{

    public static Boolean verificarString(String numero){
        String regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return numero.matches(regex);
    }

    public static List<String> buscarGrupos(String regex, String numero){
        List<String> elementosSumatorios = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numero);
        while (m.find()){
            elementosSumatorios.add(m.group());
        }
        return elementosSumatorios;
    }


    public static Integer sumaValores(List<String> numeros) {
        int total = 0;
        for (String romanos : numeros) {
            for (Romanos numeroRomano : Romanos.values()) {
                if (numeroRomano.name().equals(romanos)) {
                    total += numeroRomano.getValorDecimal();
                }
            }
        }
        return total;
    }


    public static Integer valorFinal(String numero){
        String regexRestan = "(C[DM])|(X[LC])|(I[VX])";
        String regexSuman = "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])";
        if (verificarString(numero)) {
            return sumaValores(buscarGrupos(regexSuman, numero)) + sumaValores(buscarGrupos(regexRestan, numero));
        }else{
            return 0;
        }
    }

}
