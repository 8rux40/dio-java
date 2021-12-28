package com.tardin.desafio.desafios_java_developer;

import java.util.Scanner;

public class Xadrez {

    private static final int WHITE = 1;
    private static final int BLACK = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var line = scanner.nextInt();
        var column = scanner.nextInt();
        var color = predictColor(line, column);

        System.out.println(color);
        scanner.close();
    }

    private static int predictColor(int line, int column) {
        return (line + column) % 2 == 0 ? WHITE : BLACK;
    }
}
