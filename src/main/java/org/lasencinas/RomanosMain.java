package org.lasencinas;



public class RomanosMain{

    public static Boolean verificarString(String numero){
        String regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return numero.matches(regex);
    }

    public static Integer calculoNumerosRomanos(String numero){
        String regexSumatorio = "^M{0,3}(D?C{0,3})(L?X{0,3})(V?I{0,3})";
    }
}
