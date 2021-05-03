package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import java.util.Scanner;

public class Multiplos {
    private final int firstNumber, secondNumber;

    public Multiplos(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static void main(String[] args){
        System.out.println(readEntries().areMultiple() ? "Sao Multiplos" : "Nao sao Multiplos");
    }

    private static Multiplos readEntries(){
        Scanner scanner = new Scanner(System.in);
        return new Multiplos(scanner.nextInt(), scanner.nextInt());
    }

    public boolean areMultiple(){
        return this.firstNumber % this.secondNumber == 0 || this.secondNumber % this.firstNumber == 0;
    }
}
