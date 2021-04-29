package com.tardin.desafio.iniciando_programacao_em_java;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EntradaESaidaCPF {
    private static final String CPF_SEPARATOR_REGEX = "[.\\-]";

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Arrays.stream(getCPFInSeparatedStrings(new Scanner(System.in).nextLine())).forEach(System.out::println);
    }

    public static String[] getCPFInSeparatedStrings(String cpfWithSpecialChars) {
        return cpfWithSpecialChars.split(CPF_SEPARATOR_REGEX);
    }
}
