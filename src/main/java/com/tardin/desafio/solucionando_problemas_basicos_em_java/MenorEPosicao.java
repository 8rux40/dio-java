package com.tardin.desafio.solucionando_problemas_basicos_em_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MenorEPosicao {
    private final int[] X;
    private int smallerNumber = 0;

    public MenorEPosicao(int[] X) {
        this.X = X;
        calculateSmallerNumber();
    }

    public static void main(String[] args) {
        MenorEPosicao minorAndPosition = readEntries();
        System.out.printf("Menor valor: %d\nPosicao: %d",
                minorAndPosition.getSmallerNumber(), minorAndPosition.getSmallerNumberPosition());
    }

    public static MenorEPosicao readEntries() {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[scanner.nextInt()];
        for (int i = 0; i < inputNumbers.length; i++)
            inputNumbers[i] = scanner.nextInt();
        return new MenorEPosicao(inputNumbers);
    }

    private void calculateSmallerNumber() {
        this.smallerNumber = Arrays.stream(this.X).min().getAsInt();
    }

    public int getSmallerNumber() {
        return this.smallerNumber;
    }

    public int getSmallerNumberPosition() {
        return IntStream.range(0, this.X.length).filter(i -> this.X[i] == this.smallerNumber)
                .findFirst().getAsInt();
    }
}
