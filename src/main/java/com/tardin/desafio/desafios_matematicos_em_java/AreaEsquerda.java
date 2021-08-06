package com.tardin.desafio.desafios_matematicos_em_java;

import java.util.Scanner;

public class AreaEsquerda {
    private static final int MATRIX_SIZE = 12;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var O = scanner.next().toUpperCase().charAt(0);
        var M = readEntries(scanner);
        System.out.printf("%.1f", O == 'S' ? getSum(M) : getAverage(M));
    }

    public static double getAverage(double[][] M) {
        return getSum(M) / 30.0;
    }

    public static double[][] readEntries(Scanner scanner) {
        var M = new double[MATRIX_SIZE][MATRIX_SIZE];
        for (int i = 0; i < MATRIX_SIZE; i++)
            for (int j = 0; j < MATRIX_SIZE; j++)
                M[i][j] = scanner.nextDouble();
        return M;
    }

    public static double getSum(double[][] M) {
        double sum = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (((i < M.length / 2) && j - i < 0) || ((i >= M.length / 2) && i + j <= 10))
                    sum += M[i][j];
            }
        }
        return sum;
    }
}
