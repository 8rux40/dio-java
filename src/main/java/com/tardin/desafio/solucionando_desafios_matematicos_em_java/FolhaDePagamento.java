package com.tardin.desafio.solucionando_desafios_matematicos_em_java;

import java.util.Scanner;

public class FolhaDePagamento {
    private final int workedHours, workerNumber;
    private final double hourValue;

    public FolhaDePagamento(int workerNumber, int workedHours, double hourValue) {
        this.workedHours = workedHours;
        this.workerNumber = workerNumber;
        this.hourValue = hourValue;
    }

    public static void main(String[] args){
        FolhaDePagamento payCheck = readEntries();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", payCheck.getWorkerNumber(), payCheck.getSalary());
    }

    private static FolhaDePagamento readEntries(){
        Scanner scanner = new Scanner(System.in);
        return new FolhaDePagamento(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
    }

    public double getSalary(){
        return this.workedHours * this.hourValue * 1f;
    }

    public int getWorkerNumber (){
        return this.workerNumber;
    }
}