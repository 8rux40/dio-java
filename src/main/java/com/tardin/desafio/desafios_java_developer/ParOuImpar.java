package com.tardin.desafio.desafios_java_developer;

import java.util.Scanner;

public class ParOuImpar {

    public enum Parity{
        ODD_NEGATIVE("ODD NEGATIVE"),
        NULL("NULL"),
        ODD_POSITIVE("ODD POSITIVE"),
        EVEN_NEGATIVE("EVEN NEGATIVE"),
        EVEN_POSITIVE("EVEN POSITIVE");

        private String description;

        Parity(String description){
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var numberOfEntries = scanner.nextInt();
        int entry;
        for (int i = 0; i < numberOfEntries; i++) {
            entry = scanner.nextInt();
            System.out.println(getParity(entry).getDescription());
        }
    }

    private static Parity getParity(int number){
        if (number == 0) return Parity.NULL;
        var isEven = number % 2 == 0;
        if (number > 0){
            if (isEven) return Parity.EVEN_POSITIVE;
            else return Parity.ODD_POSITIVE;
        } else {
            if (isEven) return Parity.EVEN_NEGATIVE;
            else return Parity.ODD_NEGATIVE;
        }
    }
}
