package com.tardin.desafio.desafios_java_developer;

import java.util.Scanner;

public class Dama {

    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while (true) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();

            if (canItStop()) break; //condição de parada
            if (isTheLadyAlreadyInPosition())
                System.out.println("0");
            else if (isTheLadyInTheSameLineOrColumn() || isTheLadyOnTheSameDiagonal())
                System.out.println("1");
            else
                System.out.println("2");
        }
        scanner.close();
    }

    private static boolean canItStop() {
        return x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0;
    }

    private static boolean isTheLadyAlreadyInPosition() {
        return x1 == x2 && y1 == y2;
    }

    private static boolean isTheLadyInTheSameLineOrColumn() {
        return (x1 == x2) || (y1 == y2);
    }

    private static boolean isTheLadyOnTheSameDiagonal() {
        for (int i = 1; i <= x1; i++) {
            if ((x1 - i == x2 && y1 - i == y2) || (x1 + i == x2 && y1 + i == y2))
                return true;
        }

        for (int i = 1; i <= 8 - x1; i++) {
            if ((x1 + i == x2 && y1 - i == y2) || (x1 - i == x2 && y1 + i == y2))
                return true;
        }

        return false;
    }
}
