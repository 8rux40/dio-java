package com.tardin.desafio.desafios_java_developer;

import java.util.Scanner;

import static java.lang.Math.*;

public class TrigoNoTabuleiro {

    private static final double GRAIN_FOR_KILOGRAM = 1.0 / 12L / 1000L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberOfTestCases = scanner.nextInt();

        for(int i = 0; i < numberOfTestCases; i++) {
            var boardSquares = scanner.nextInt();
            System.out.printf("%.0f kg%n", amountOfWheatInKilograms(boardSquares));
        }
        scanner.close();
    }

    private static double amountOfWheatInKilograms(int boardSquares){
        return floor(pow(2, boardSquares) * GRAIN_FOR_KILOGRAM);
    }
}
