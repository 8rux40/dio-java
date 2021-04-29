package com.tardin.desafio.iniciando_programacao_em_java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        getPositivePairsUntilNumber(number).forEach(System.out::println);
    }

    public static IntStream getPositivePairsUntilNumber(int number) {
        IntStream pairNumbers = IntStream.rangeClosed(1, number);
        return pairNumbers.filter(x -> x % 2 == 0);
    }
}
