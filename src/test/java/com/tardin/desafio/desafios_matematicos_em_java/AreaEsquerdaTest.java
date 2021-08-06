package com.tardin.desafio.desafios_matematicos_em_java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaEsquerdaTest {
    private double[][] M;
    private double sum;
    private double average;

    @BeforeEach
    public void initialize() {
        M = new double[][]{
                { -19, 0, -7, 13, -4, 46, 23, -28, 33, -28, -31, 25 },
                { -9, 29, -48, 36, 7, -8, 48, 34, -42, 31, -11, -41 },
                { 25, -20, -46, 14, 34, 49, 38, -29, 36, 30, 40, 36 },
                { 38, 0, 10, -41, -8, -21, -7, -46, -24, 29, 11, -22 },
                { 4, 12, 8, -45, 19, 29, 1, -29, -4, -28, -16, -38 },
                { 14, 39, 35, -19, 16, -12, -20, 20, 15, 5, -37, 38 },
                { 4, 4, 8, -31, 24, 22, 2, 16, 47, -48, 6, 32 },
                { 18, 10, 36, -1, -23, 46, 20, -47, -17, 32, -47, -8 },
                { 9, 26, -47, 12, 26, 45, 24, -4, 8, -46, -29, 13 },
                { 9, 48, 11, 36, -40, 18, -28, 41, 40, 47, -34, 34 },
                { -28, -34, -41, -24, -42, 0, 48, -26, 16, -48, 6, 26 },
                { 5, 15, -33, -33, -48, -3, -31, -29, -36, -47, -44, 10 }};
        sum = 197.0;
        average = sum / 30.0;
    }

    @Test
    public void testSum() {
        assertEquals(sum, AreaEsquerda.getSum(M));
    }

    @Test
    public void testAverage() {
        assertEquals(average, AreaEsquerda.getAverage(M));
    }
}
