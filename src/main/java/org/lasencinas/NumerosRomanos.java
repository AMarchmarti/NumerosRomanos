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

    public static Set<String> buscarGruposSuma(String numero){
        Set<String> sumatorios = new HashSet<>();
        String regexSumatorio = "[MCXI]{3}|(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])";
        Pattern p = Pattern.compile(regexSumatorio);
        Matcher m = p.matcher(numero);
        while (m.find()){
            sumatorios.add(m.group());
        }
        return sumatorios;
    }

    pu
}
