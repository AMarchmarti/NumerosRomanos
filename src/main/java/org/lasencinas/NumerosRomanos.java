package org.lasencinas;


import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos{

    public static Boolean verificarString(String numero){
        String regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return numero.matches(regex);
    }

    public static Set<String> buscarGruposResta(String numero){
            Set<String> elementosExtraidos = new HashSet<>();
            String regex = "(C[DM])|(X[LC])|(I[VX])";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(numero);
            while (m.find()){
                elementosExtraidos.add(m.group());
            }
            return elementosExtraidos;
    }

    public static Set<String> buscarGruposSuma(String numero){
        Set<String> elementosSumatorios = new HashSet<>();
        String regex = "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numero);
        while (m.find()){
            elementosSumatorios.add(m.group());
        }
        return elementosSumatorios;
    }


    public static Integer sumaValores(String numero) {
        int total = 0;
        for (int i = 0; i < numero.length(); i++) {
            Character num = numero.charAt(i);
            for (Romanos numeroRomano : Romanos.values()) {
                if (numeroRomano.name().equals(num.toString())) {
                    total += numeroRomano.getValorDecimal();
                }
            }
        }
        return total;
    }

    public static Integer sumaValoresExtraidos(String numero) {
        Set<String> numeros = buscarGruposResta(numero);
        int total = 0;
        for (String romanos : numeros) {
            for (Romanos numerosRomanos : Romanos.values()) {
                if (numerosRomanos.name().equals(romanos)) {
                    total += numerosRomanos.getValorDecimal();
                }
            }
        }
        return total;
    }

    public static Integer valorFinal(String numero){
        verificarString(numero);
        String regex = "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numero);
        int total = 0;
        while (m.find()){
            total += sumaValores(m.group());
        }
        return total + sumaValoresExtraidos(numero);
    }

}
