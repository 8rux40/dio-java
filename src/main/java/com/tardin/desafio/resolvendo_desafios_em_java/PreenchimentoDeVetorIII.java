package com.tardin.desafio.resolvendo_desafios_em_java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoDeVetorIII {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        var n = getBigDecimalArray(x);
        var formatter = new DecimalFormat("0.0000");
        for (int i = 0; i < n.length; i++)
            System.out.printf("N[%d] = %s%n", i, formatter.format(n[i]));
    }

    public static BigDecimal[] getBigDecimalArray(double x) {
        var array = new BigDecimal[100];
        array[0] = new BigDecimal(x);
        for (int i = 1; i < array.length; i++) array[i] = array[i - 1].divide(BigDecimal.valueOf(2));
        return array;
    }
}
