package com.tardin.desafio.solucionando_problemas_basicos_em_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumerosImpares {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        Arrays.stream(getOddNumbersUntilNumber(x)).forEach(System.out::println);
    }

    public static Integer[] getOddNumbersUntilNumber(int number){
        return IntStream.rangeClosed(1, number).filter(n -> n % 2 != 0).boxed().toArray(Integer[]::new);
    }
}
