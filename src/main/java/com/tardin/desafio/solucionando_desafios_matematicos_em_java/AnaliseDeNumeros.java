package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnaliseDeNumeros {
    public static final int NUMBER_OF_ENTRIES = 5;
    private final List<Integer> numbers;
    private int pair = 0, negative = 0, positive = 0;

    public AnaliseDeNumeros(List<Integer> numbers) {
        this.numbers = numbers;
        analyzeNumbers();
    }

    public static void main(String[] args) {
        AnaliseDeNumeros numberAnalysis = readEntries();
        System.out.printf(
                "%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)",
                numberAnalysis.getPairs(),
                numberAnalysis.getOdd(),
                numberAnalysis.getPositives(),
                numberAnalysis.getNegatives()
        );
    }

    private static AnaliseDeNumeros readEntries() {
        Scanner scanner = new Scanner(System.in);
        return new AnaliseDeNumeros(IntStream.rangeClosed(1, NUMBER_OF_ENTRIES)
                .mapToObj(value -> scanner.nextInt())
                .collect(Collectors.toCollection(ArrayList::new)));
    }

    public int getOdd() {
        return NUMBER_OF_ENTRIES - this.pair;
    }

    public int getPositives() {
        return this.positive;
    }

    public int getNegatives() {
        return this.negative;
    }

    public int getPairs() {
        return this.pair;
    }

    private void analyzeNumbers() {
        this.numbers.forEach(number -> {
            this.pair += numberIsPair(number) ? 1 : 0;
            this.negative += numberIsNegative(number) ? 1 : 0;
            this.positive += numberIsPositive(number) ? 1 : 0;
        });
    }

    private static boolean numberIsPair(int number) {
        return number % 2 == 0;
    }

    private static boolean numberIsPositive(int number) {
        return number > 0;
    }

    private static boolean numberIsNegative(int number) {
        return number < 0;
    }
}
