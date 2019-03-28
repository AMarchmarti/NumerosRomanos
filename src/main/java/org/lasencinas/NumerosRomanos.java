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


}