package com.tardin.desafio.solucionando_problemas_basicos_em_java;

import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("PROD = %d", multiply(scanner.nextInt(), scanner.nextInt()));
    }

    public static int multiply(int multiplicand, int multiplier){
        return multiplicand * multiplier;
    }
}