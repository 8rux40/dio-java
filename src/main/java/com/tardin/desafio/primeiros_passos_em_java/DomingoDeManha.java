package com.tardin.desafio.primeiros_passos_em_java;

import java.util.Scanner;

public class DomingoDeManha {

    private static final int APPOINTMENT = 8 * 60;
    private static final int MAXIMUM_DELAY_UNTIL_TERMINAL = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] clock = scanner.nextLine().split(":");
            int hours = Integer.parseInt(clock[0]);
            int minutes = Integer.parseInt(clock[1]);
            System.out.printf("Atraso maximo: %d\n", getMaximumDelay(hours, minutes));
        }
    }

    public static int getMaximumDelay(int hours, int minutes) {
        return Math.max(MAXIMUM_DELAY_UNTIL_TERMINAL + (hours * 60 + minutes) - APPOINTMENT, 0);
    }
}
